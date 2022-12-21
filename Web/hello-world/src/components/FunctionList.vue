<template>
  <div style="text-align: center">
    <button class="btn1" v-on:click="appendRow">Добавить</button>
    <button class="btn2" v-on:click="appendRow">Удалить</button>
    <button class="btn3" v-on:click="appendRow">Изменить</button>
    <TABLE>
      <TR>
        <TH>Имя</TH>
        <TH>Значение</TH>
      </TR>
      <function-row v-for="function in functionList" v-bind:key="function.functionName" :function-data="function">
      </function-row>
    </TABLE>
  </div>
</template>

<script>
import FunctionRow from "./FunctionRow";

export default {

  name: "FunctionList",
  components: {
    FunctionRow
 },
  computed:{
    functionList(){
      return this.$store.getters.getFunctionList
    },
  },
  methods: {
    appendRow(){
      alert('Сообщение')
    }
  }
}
</script>

<style scoped>

TABLE{
  background: #a9203e;
  width: 50%;
  margin-left: auto;
  margin-right: auto;
  border-radius: 5px;
}
TH{
  color: #fff86b;
}
TR{
  color: #ab4e52;
}
TR:hover{
  color: #fff86b;
}
TH{
  font-size: 20px;
}

.btn1{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 15px 0 0;
  height: 45px;
  width: 100px;
  border: none;
  border-radius: 15px;
  font-size: 15px;
  font-weight: bold;
  background-color: #013220;
  color: #02f2d6;
}
.btn1:hover{
  transition: all 0.2s;
  background-color: #02f2d6;
  color: #013220;
}
.btn1:active{
  background-color: #35682d;
}
.btn2{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 15px 15px 0;
  height: 45px;
  width: 100px;
  border: none;
  border-radius: 15px;
  font-size: 15px;
  font-weight: bold;
  background-color: #013220;
  color: #02f2d6;
}
.btn2:hover{
  transition: all 0.2s;
  background-color: #02f2d6;
  color: #013220;
}
.btn2:active{
  background-color: #47a76a;
}
.btn3{
  display: inline-block;
  box-sizing: border-box;
  margin: 0 0 15px 0;
  height: 45px;
  width: 100px;
  border: none;
  border-radius: 15px;
  font-size: 15px;
  font-weight: bold;
  background-color: #013220;
  color: #02f2d6;
}
.btn3:hover{
  transition: all 0.2s;
  background-color: #02f2d6;
  color: #013220;
}
.btn3:active{
  background-color: #47a76a;
}
</style>