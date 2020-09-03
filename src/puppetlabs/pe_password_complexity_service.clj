(ns puppetlabs.pe-password-complexity-service
  (:require [clojure.tools.logging :as log]
            [puppetlabs.pe-password-complexity-core :as core]
            [puppetlabs.trapperkeeper.core :as trapperkeeper]))

(defprotocol HelloService
  (hello [this caller]))

(trapperkeeper/defservice hello-service
  HelloService
  []
  (init [this context]
    (log/info "Initializing hello service")
    context)
  (start [this context]
    (log/info "Starting hello service")
    context)
  (stop [this context]
    (log/info "Shutting down hello service")
    context)
  (hello [this caller]
         (core/hello caller)))
