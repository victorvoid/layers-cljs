(ns views
  (:require
   [re-frame.core :as re-frame]
   [layouts.app-layout :refer [app-layout]]
   [subs :as subs]
   [pages.home.ui :refer [home-panel]]))

(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    [:div]))

(defn show-panel [panel-name]
  [app-layout
   [panels panel-name]])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))
