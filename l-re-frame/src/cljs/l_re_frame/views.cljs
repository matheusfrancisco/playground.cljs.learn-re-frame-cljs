(ns l-re-frame.views
  (:require
   [re-frame.core :as re-frame]
   [l-re-frame.subs :as subs]
   [l-re-frame.events :as events]))


;;The view layer
;;in the view cljs we write
;;the hiccup code that is then translated into js
;;
;;We import subs as subs and events as events into 
;;this  namespace with require

;;in the let statement we get the state variables
;;values with subscribe fucntions
;;this is the way to call the reg-subs in subs.cljs


;;test(re-fatest (re-frame/subscribe [::subs/test])
;;we get the test object. To get the value inside
;;we need to put @ in front of the variable. @test
;;prints out the “test default value”. With clojure
;;terms this is accessing the state of the atom: deref.)

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])
        test (re-frame/subscribe [::subs/test])]
    [:div
     [:p "Test value: " @test]
     [:p "Name value " @name]
     [:button {
               :on-click #(re-frame/dispatch [::events/name-change "Name changed!"])
               } "Change name"]]))
