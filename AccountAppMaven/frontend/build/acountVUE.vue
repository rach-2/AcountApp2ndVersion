<template>
    <div class="account">
    <form id="data" >
   <input type="text" v-model="fristName"> <input>
   {fristName}
     <label>{fristNameLabel}</label>   <inputt type="text", v-model="lastName"></inputt>
        
       <lastNam <input type="text", v-model="acountNumber"> </input>
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
    
    showShowAcount

         
    }

}


  account = new vue()
  {
      el: "account",
       fristNameLabel: "EnterFristName"
       LastNameLabel: "enterLastName";
       AcountNumberLabel: "enterLastName,
       acountNumberLabel: "acountNumber'
  }



</script>

