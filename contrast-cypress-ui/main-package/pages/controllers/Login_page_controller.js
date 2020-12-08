import Login_page_objects from "../objects/Login_page_objects";

class Login_page_controller {
    constructor() {
        this.elements = new Login_page_objects();
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
export default Login_page_controller;