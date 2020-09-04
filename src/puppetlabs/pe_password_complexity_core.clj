(ns puppetlabs.pe-password-complexity-core)

(defn retain-old-fn
  [fn-name old-fn]
  (def fn-name old-fn))

(defn new-create-user!
  "creates use while validating password"
  [db user]
  ())

(defn validate-password
  [password]
  ())

(defn new-update-user-password!
  [db login new-password clear-token-uuid?]
  (puppetlabs.pe-password-complexity-core/validate-password new-password)
  (puppetlabs.pe-password-complexity-core/old-update-user-password! db login new-password clear-token-uuid?))

(defn new-create-user!
  [db user]
  (puppetlabs.pe-password-complexity-core/validate-password (-> user [:password]))
  (puppetlabs.pe-password-complexity-core/old-create-user! db user))
