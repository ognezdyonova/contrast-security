class Login_page_objects {
    logo_image(){
        return cy.get('.cs-logo');
    }

    title_label(){
        return cy.get('.title-label');
    }

    login_input(){
        return cy.get('[ng-model="model.username"]');
    }

    pass_input(){
        return cy.get('[ng-model="model.password"]');
    }

    next_button(){
        return cy.get('[ladda="loggingIn"]');
    }

    login_button(){
        return cy.get('[ladda="loggingIn"]');
    }

    forgot_link(){
        return cy.get('[ng-if="model.show_forgot_password"]');
    }
}
export default Login_page_objects;