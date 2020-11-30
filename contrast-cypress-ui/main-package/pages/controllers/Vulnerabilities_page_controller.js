import Tag_Vulnerability_modal_objects from "../objects/Tag_Vulnerability_modal_objects";
import Vulnerabilities_page_objects from "../objects/Vulnerabilities_page_objects";
import Header_page_objects from "../objects/Headers_page_objects";

class Vulnerabilities_page_controller {
    constructor() {
        this.add_tag_modal = new Tag_Vulnerability_modal_objects();
        this.elements = new Vulnerabilities_page_objects();
        this.header = new Header_page_objects();
    }
}
export default Vulnerabilities_page_controller;