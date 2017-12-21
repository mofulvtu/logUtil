<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>glDatePicker</title>
    <#--默认样式：default-->
    <link href="/res/glDatePicker/css/glDatePicker.default.css" rel="stylesheet" type="text/css">
    <#--样式二-->
    <link href="/res/glDatePicker/css/glDatePicker.darkneon.css" rel="stylesheet" type="text/css">
    <#--样式三-->
    <link href="/res/glDatePicker/css/glDatePicker.flatwhite.css" rel="stylesheet" type="text/css">
</head>
<style>
    input{
        width: 30%;
        height: 34px;
    }
</style>
<body>
       <div style="text-align: center">
          <p>glDatePicker</p>

          <input type="text" id="example" />

       </div>
<script src="/res/glDatePicker/js/jquery.min.js"></script>
<script src="/res/glDatePicker/js/glDatePicker.js"></script>
<script src="/res/glDatePicker/js/glDatePicker.min.js"></script>

<script type="text/javascript">
    $(window).load(function()
    {
        $('#example').glDatePicker({
            cssName: 'flatwhite'
        });
    });
</script>

</body>
</html>