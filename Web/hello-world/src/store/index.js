import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios"

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    msg: 'Таблица функций',
    functionList: [
        {"functionName":"ENABLE_ZERO_VAR",
          "functionValue":"1"},
      {
        "functionName":"SKPI_VAR_DAYS",
        "functionValue":"1"},
      {
        "functionName":"KSAU_VAR_DAYS",
        "functionValue":"1"}
    ]

  },
  getters: {
    getMsg (state){
      return state.msg
    },
    getFunctionList(state)
    {
      return state.functionList
    }
  },
  mutations: {
    setFunctionList(state, functionList){
      state.functionList = functionList
    }
  },
  actions: {
    async loadFunctionList(context){
      try{
        const url = '/kis/app_functions'
        const response = await axios.get(url)
        const results = response.data
        context.commit('setFunctionList', results)
      } catch(err){
        if (err.response){
          console.log("Server Error:", err)
        } else if (err.request){
          console.log("Network Error", err)
        } else {
          console.log("Client Error",err)
        }
      }
    }
  },
  modules: {
  }
})
