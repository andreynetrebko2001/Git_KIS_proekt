<template>
  <div id="app">
    <hello-world>
    </hello-world>
    <function-list>
    </function-list>
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld";
import FunctionList from "@/components/FunctionList";

export default {
  components:{
    HelloWorld,
    FunctionList
  },
  async mounted(){
    await this.$store.dispatch('loadFunctionList')

  }
}
</script>

<style lang="less">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #013222;
}

nav {
  padding: 45px;

  a {
    font-weight: bold;
    color: #013222;
    background: #ffb6ad;
    &.router-link-exact-active {
      color: #66cdaa;
    }
  }
}
</style>
