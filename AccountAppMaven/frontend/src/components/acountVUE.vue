<template name"accounts">
    <div class="account">
    <account>   </account>
    <form id="data" >
      <label>{FristNameLable}</label>   <inputt type="text", v-model="lastName"></inputt>
  <input type="text" v-model="fristName"> <input>
     <label>{lastNameLabel}</label>   <inputt type="text", v-model="lastName"></inputt>
    <label> {accountNumber} </labe></label><input type="text", v-model="acountNumber"> </input>
    
   <button @click="createAcount()">{addAndaccount}</button>
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
        }

        acountToSow
            
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
          
          
          
          
          export default ()
          {
                 config
          }
           
          
         
    }
   
   

         
    
 }
 new vue()
 {
     el: '#account',
     fristNameLabel: "Enter FristName",
     lastNameLabel:"enterLastName',
     AccountNumberLabel:"EnterAccount",
     AddAcount: "add an account"
     
     <script>
     export default {
     
     }
     </script>
     
     <style>
     
     </style>
     
     
     <script>
     export default {
     
     }
     </script>
     
     <style>
     
     </style>
     
     
     
     
    
   
     
     </style>
     
 }
</script>

