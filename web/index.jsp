
<html>
    <head>
        <style>
            body
            {
                background-color: white;
                background-image: url("Images/Background.jpg");
                background-size: 100% 100%;
                background-repeat: no-repeat;
                background-position: center;
                background-attachment: fixed;
            }
            .tbl{
                color:whitesmoke;
                background-image: url("Images/bg2.jpg");
                border:10px solid;
                border-radius: 20px;
                background-repeat:round;
                height:150px;
                opacity: 0.9;
            }
            .btn{
                border:1px solid white;
                border-radius: 10px;
                
            }
         .header_tbl
         {
            
             width:95%;
         }
         .td_style
         {
             border-radius:12px; 
             
             height:100px;
             width:10%;
             font-family: cursive;
             font: bold;
             color:black;
         }
         .tr_style
         {
             background-color:azure;
             border:1px solid white;
             opacity: 0.7;
             
         }
            </style>
        
    </head>
    <body>
        <table class="header_tbl">
            <tr>
   <td class="header_div">
        <table class="tbl">
            <tr>
            <form action="DataFetched.jsp" method="post">
                
                  <td>Pin Code</td>
                    <td><input type="text" name="pinCode" class='btn'></td>
                    <tr><td></td><td><input type="submit" name ="Check weather" class="btn"></td></tr> 
            </form>
            </tr>
            <tr>
                    <td><h3>Or</h3></td>
                </tr>
                <form action="DataFetched2.jsp" method="post">
                <tr>
                    <td>Country Name</td>
                    <td><input type="text" name="country" class='btn'></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><input type="text" name="city" class='btn'></td>
                </tr>
                <tr><td></td>
                    <td>
                        <input type="submit" value="Check Weather" class="btn">
                       </td>
                </tr>
                      
            </form>
        </table>
        </td>
        <td style="width:200px;">
                
                
            </td>
            <td style="width:200px;">
                
                
            </td>
            <td style="background-image: url('Images/sunny.jpg'); background-repeat: round; width:200px; border-radius: 40px; opacity: 0.5;">
                
                
            </td>
        </tr>
        </table>
   
    </body>
</html>