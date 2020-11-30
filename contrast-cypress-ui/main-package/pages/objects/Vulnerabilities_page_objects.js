class Vulnerabilities_page_objects {
    header_page(){
        return cy.get('.ReactVirtualized__Grid header')
    }

    search_icon(){
        return cy.get('[data-testid="search-text-icon-test-id"]');
    }

    search_input(){
        return cy.get('[data-testid="search-text-input-test-id"]');
    }

    items_of_list(){
        return cy.get('[data-testid="contrast-grid-row-0"] [data-testid="grid-cell"]');
    }

    add_tag_to_item_button(){
        return cy.get('[data-testid="action_tag"]');
    }

    send_test_id_button(){
        return cy.get('[data-testid="vuln-send-test-id"]');
    }

    delete_item(){
        return cy.get('[data-testid="vuln-delete-action"]');
    }
}
export default Vulnerabilities_page_objects;