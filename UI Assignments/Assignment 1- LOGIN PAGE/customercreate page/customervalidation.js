function validate() {
  var fname = document.getElementById("fname").value;
  
  var male = document.getElementById("male").value;
  var female = document.getElementById("female").value;
  var age = document.getElementById("age").value;
  var pnum = document.getElementById("pnum").value;

    
    var user = document.getElementById("userid").value;
    var pass = document.getElementById("passid").value;
    if(fname.length==0){
      document.getElementById("e1").innerHTML="First Name is required"
       document.getElementById("e2").innerHTML=""
        return false;
    }
   else if(!(male.checked||female.checked)){
      document.getElementById("e2").innerHTML="Please choose gender"
      document.getElementById("e1").innerHTML=""
      return false;
    }
    else if((age.length==0||age<18)){
      document.getElementById("e4").innerHTML="Please choose appropriate age greater than 18"
      return false;
    }
    else if((pnum.length==0||pnum<10)){
      document.getElementById("e5").innerHTML="Provide phonenumber of ten digits"
      return false;
    }

   
    else if(user.length==0){
      document.getElementById("e6").innerHTML="User Name is required"
     // document.getElementById("e7").innerHTML=""
        return false;
    }else if(pass.length==0){
        document.getElementById("e7").innerHTML="Password is required"
      //  document.getElementById("e6").innerHTML=""
        return false;
    }
    else {
        return true;
    }
  }

  // function validateUser(){
  //   var user = document.getElementById("userid").value;
  //   var pass = document.getElementById("passid").value;
  //   if(user.length==0){
  //       document.getElementById("e6").innerHTML="User Name is required message using key update event";
  //       document.getElementById("e7").innerHTML=""
  //   }
  //   else if(pass.length==0){
  //       document.getElementById("e7").innerHTML="Password is required "
  //       document.getElementById("e6").innerHTML=""
     
  // }