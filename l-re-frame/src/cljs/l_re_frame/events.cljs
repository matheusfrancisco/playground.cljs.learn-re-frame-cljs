(ns l-re-frame.events
  (:require
   [re-frame.core :as re-frame]
   [l-re-frame.db :as db]))

;;events handlers
;;Initialize-db function initializes the application state with default values
;;(from the db file default-db function).
;;name-change function updates the name field in the default-db map using assoc

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))


(re-frame/reg-event-db
  ::name-change
  (fn [db [_ new-name-value]]
    (assoc db :name new-name-value)))
