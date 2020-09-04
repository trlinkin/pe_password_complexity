(ns puppetlabs.pe-password-complexity-service
  (:require [clojure.tools.logging :as log]
            [puppetlabs.pe-password-complexity-core :as core]
            [puppetlabs.trapperkeeper.core :as trapperkeeper]
            [puppetlabs.rbac.storage :as st]))

(trapperkeeper/defservice validation-service
  [[:ConfigService get-in-config]]
  (init [this context]
    (log/info "Setting up the password validation")
    context)
