class Headers_page_objects {
    header_buttons(){
        return cy.get('.top-header .top-nav .nav-left .menu-header');
    }

    search_input(){
        return cy.get('#trace-search-box input');
    }

    add_new_agent(){
        return cy.get('[ng-if="showAddAgentButton()"] a');
    }

    user_link() {
        return cy.get('.avatar-display-container');
    }

    user_menu_settings_link(){
        return cy.get('[data-e2e="user-menu"] li a');
    }
}
export default Headers_page_objects