/// <reference types="cypress" />
// ***********************************************************
// This example plugins/index.js can be used to load plugins
//
// You can change the location of this file or turn off loading
// the plugins file with the 'pluginsFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/plugins-guide
// ***********************************************************

// This function is called when a project is opened or re-opened (e.g. due to
// the project's config changing)

/**
 * @type {Cypress.PluginConfig}
 */
module.exports = (on, config) => {
    // `on` is used to hook into various events Cypress emits
    // `config` is the resolved Cypress config

    on("before:browser:launch", (browser = {}, launchOptions) => {
        console.log("Browser: " + browser.name);
        if (browser.name === "chrome") {
            /*@deepuec - Installing the chrome extension below in the browser (operated by Cypress) would fix the issue you are getting. Cheers!
            https://chrome.google.com/webstore/detail/ignore-x-frame-headers/gleekbfjekiniecknbkamfmkohkpodhe*/
            launchOptions.args.push("--disable-features=CrossSiteDocumentBlockingIfIsolating,CrossSiteDocumentBlockingAlways,IsolateOrigins,site-per-process");
            launchOptions.args.push("--load-extension=main-package/extensions/Ignore-X-Frame-headers");
            launchOptions.args.push("--start-fullscreen");
            launchOptions.args.push("--incognito");
            launchOptions.args.push('--disable-dev-shm-usage');
            launchOptions.args.push('--disable-site-isolation-trials');
            return launchOptions;
        }
    });
}