(ns l-re-frame.subs
  (:require
   [re-frame.core :as re-frame]))

;;The query layer
;;In subs we write the functions that call the applications state
;;this is done with reg-sub functions
;;one for each attribute
;;
(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))


(re-frame/reg-sub
  ::test
  (fn [db]
    (:test db)))
