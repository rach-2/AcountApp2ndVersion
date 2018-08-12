import axios from "axios";
import Vue from "vue";

export const CONFIG = axios.create({
       baseUrl: '/api'
});



