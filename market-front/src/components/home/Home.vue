<template>
	<!-- vue 中所有的组件要被根结点div包含起来 -->
	<div class="home">
    <div class="a">
      <img src="../../assets/1.png"  class="png">
    </div> 
     <div class="b">
      <img src="../../assets/1.png"  class="png">
    </div>
    <div class="c">
      <img src="../../assets/1.png"  class="png">
    </div>
    <div class="d">
      <img src="../../assets/1.png"  class="png">
    </div>
		<v-header></v-header>
		<h1 align="center" style="font-size: 50px;color: #333333;user-select: none;cursor:default;">EI-Market</h1>
		<v-search-bar></v-search-bar>
		<br><br>
		<v-catalog></v-catalog>
 	</div>
</template>

<script>
  import Header from './Header.vue'
  import SearchBar from './SearchBar.vue'
  import Catalog from './Catalog.vue'
  import GoodsList from '../goods/GoodsList.vue'

  export default {
    data() {
      return {
        msg: 'Hello world from home！',
        title: '首页',

      }
    },
    methods: {},
    components: {
      'v-header': Header,
      'v-search-bar': SearchBar,
      'v-catalog': Catalog,
      'v-goods-list': GoodsList
    }, mounted() {

    }
	}

</script>
<!-- scoped表示局部作用域 -->

<style lang="scss">
hr{
	color:#c3c3c3;
}
  .copyright-footer{
    background-color: #545C64;
    text-align: center;
    color: white;
    margin-top: 20px;
    position: relative;
  }
  .a {
    width: 200px;
    height: 200px;
    position:absolute;
    top:438px;
    left: 239px;
  }
  .b {
    width: 200px;
    height: 200px;
    position:absolute;
    top:438px;
    left: 591px;
  }  .c {
    width: 200px;
    height: 200px;
    position:absolute;
    top:438px;
    left: 943px;
  }
  .d{
    width: 200px;
    height: 200px;
    position:absolute;
    top:438px;
    left: 1295px;
  }
    .foot-text{
    margin-top: 20px;
  }
 .png {
    width:200px;
    height: 200px;
    position:absolute;
    z-index: 3;
  }
</style>
