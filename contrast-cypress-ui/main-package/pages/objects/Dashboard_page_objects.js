class Dashboard_page_objects {
    logo_image(){
        return cy.get('.logo');
    }

    header_buttons(){
        return cy.get('.top-header .top-nav .nav-left .menu-header');
    }

    search_input(){
        return cy.get('#trace-search-box input');
    }

    add_new_agent(){
        return cy.get('[ng-if="showAddAgentButton()"] a');
    }

}
export default Dashboard_page_objects;