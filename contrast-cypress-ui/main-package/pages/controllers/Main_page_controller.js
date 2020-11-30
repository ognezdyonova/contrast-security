import Main_page_objects from "../objects/Main_page_objects";
import Login_page_controller from "./Login_page_controller";

class Main_page_controller {
    constructor() {
        this.elements = new Main_page_objects();
    }

    open_login_page() {
        this.elements.login_links()
            .contains('login')
            .should("be.visible")
            .get('.login-dropdown')
            .invoke('show');

        this.elements.login_links_dropdowns_buttons()
            .contains('Community Edition')
            .should("be.visible")
            .click({force: true})

        cy.on('uncaught:exception', (err) => {
            expect(err.message).to.include('The following error originated from your application code');
            return false;
        });
    }

    login_user(login, pass) {

        let login_page = new Login_page_controller();
        login_page.elements.login_input().should("be.visible").type(login);
        login_page.elements.next_button().should("be.visible").click({force: true});
        login_page.elements.pass_input().should("be.visible").type(pass);
        login_page.elements.login_button().should("be.visible").click({force: true});
        Cypress.Cookies.preserveOnce('session_id', 'remember_token');
        cy.on('uncaught:exception', (err) => {
            expect(err.message).to.include('The following error originated from your application code');
            return false;
        });


    }
}

export default Main_page_controller;