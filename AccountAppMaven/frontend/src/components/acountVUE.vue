<template name"accounts">
    <div class="account">
    <account>   </account>
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
 </div>
<script>
export default {
    import {CONFIF} from './covfigantion.js',
    name: 'accout',

    data()
    {
        return
        response[],                                                                     
        account:{
            
            firstName: '',
            lastName: '',
            acountNumber:'',
            id:0
methods:{ createAcount(){

         var accountInformation  = new URLSearchParams()
         accountInformation.append(this.fristName);
         accountInformation.append(this.lastName);
          CONFIF.post('/account/acountInformation').then((resposne => {
                 this.response=response.data;
                 acount.firstName = response.data
                 acount.lastName =  resposne.data
                 acount.acountNumber = response.data,
                }))
         
         
            
         export default {
             
         
         }
         </script>
         
         <style>
         
         </style>
         
    }

    showAccounts(){
          
          
          <script>
          export default ()
          {
               
          }
           
          
         
    }
   
   showAccounts{
    accoun

}


         
    )
 }
</script>

