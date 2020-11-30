class Main_page_objects {
    logo_image(){
        return cy.get('.parentmenu .logowhite');
    }

    menu_buttons(){
        return cy.get('.menu [data-hs-cos-type="menu"] [role="navigation"] ul .hs-menu-depth-1');
    }

    demo_buttons(){
        return cy.get(".menu .menu-last-link");
    }

    login_links(){
        return cy.get(".top-nav-new.move-left .login-link")
    }

    login_links_dropdowns_buttons(){
        return cy.get(".top-nav-new.move-left .login-link .login-dropdown li")
    }

    search_icon(){
        return cy.get(".hs-search-field__input");
    }


}
export default Main_page_objects;