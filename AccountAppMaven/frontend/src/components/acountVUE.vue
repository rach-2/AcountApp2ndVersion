<template>
    <div class="account">
    <account> [  </account>
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
 <template>
     <div id="accounts"></div>
     <table>
       

     </table>
 </template>
<
<script>
export default {
    import {CONFIF} from './covfigantion.js',
    name: 'accout',
    data()
    {
        return
        Response[],                                                                     
        account:{
            
            fistName: ''
            lastName: '',
            acountNumber:'',
methods:{ createAcount(){

         var accountInformation  = new URLSearchParams()
         accountInformation.append(this.fristName);
         accountInformation.append(this.lastName);
          CONFIF.post('/account/acountInformation')
         
    }

    showAccounts(){
           <table> 
           
           
            </table>
         
    }

}


//  account = new vue()
//   {
//       el: '#acount',
//       data ={
//           firstName: '',
//           lastName: '',
//           accountNumber:'',

//       }

//       createAccount()
//       {
//           var fristName = this.firstName
//           var lastName = this.lastName;
//           var acountNumber =this.accountNumber
//           var accountInformation  = new URLSearchParams()
//            accountInformation.append(fristName);
//             accountInformation.append(lastName);
//             accountInformation.append(acountNumber);
//            postMessage(accountInformation.getAll);
//     }

//   }


// ShowAcounts = new vue()
// {
//     el: '#accounts";
//     ShowData(
//         
//     )
// }

</script>

