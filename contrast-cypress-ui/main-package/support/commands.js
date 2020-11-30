// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add("login", (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add("drag", { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add("dismiss", { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite("visit", (originalFn, url, options) => { ... })


import Main_page_objects from "../pages/objects/Main_page_objects";
import Login_page_controller from "../pages/controllers/Login_page_controller";

Cypress.Commands.add('re_auth', (login, pass) => {
    cy.wait(5000).get("body").then($body => {
        if ($body.find('.top-nav-new.move-left .login-link').length > 0) {   //evaluates as true
            let main_page = new Main_page_objects();
            main_page.login_links()
                .contains('login')
                .should("be.visible")
                .get('.login-dropdown')
                .invoke('show');

            main_page.login_links_dropdowns_buttons()
                .contains('Community Edition')
                .should("be.visible")
                .click({force:true})

            cy.on('uncaught:exception', (err) => {
                expect(err.message).to.include('The following error originated from your application code');
                return false;
            });


            let login_page = new Login_page_controller();
            login_page.elements.login_input().should("be.visible").type(login);
            login_page.elements.next_button().should("be.visible").click({force: true});
            login_page.elements.pass_input().should("be.visible").type(pass);
            login_page.elements.login_button().should("be.visible").click({force: true});

            cy.on('uncaught:exception', (err) => {
                expect(err.message).to.include('The following error originated from your application code');
                return false;
            });
        }
    });

});