<template>
    <div class="account">
    <form id="data" >
   <input type="text" v-model="fristName"> <input>
   {fristName}
     <label>enterFristNs</label>   <inputt type="text", v-model="lastName"></inputt>
        {lastName}
        <input type="text", v-model="acountNumber"> </input>
        {accourNumber}
        {data}
        <button @click="createAcount()">CreateAccount</button>
 </form>
 <template>
     <div id="accounts"></div>
     <table>

     </table>
 </template>
</template>
</div>
<script>
export default {
    import {CONFIF} from './covfigantion.js',
    name: 'accout',
    dataElemnts()
    {
        return
        Response[],                                                                     
        account:{
            
            firtname: ''
            lastName: '',
            acountNumber:'',
methonds:{ createAcount(){

         var accountInformation  = new URLSearchParams()
         accountInformation.append(this.fristName);
         accountInformation.append(this.lastName);
          CONFIF.post('/account/acountInformation');
}            

      
      

    showAccounts(){

        

         
    }

}


  account = new vue()
  {
      el: "account",
      el: "acc"
  }



</script>

