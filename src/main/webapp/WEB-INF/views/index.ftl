<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
    <link rel="stylesheet" href="/res/register/css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="/res/register/css/bootstrap.min.css">

<script type="text/javascript" src="/res/register/js/jquery.min.js"></script>
<script type="text/javascript" src="/res/register/js/jquery-ui-1.9.2.custom.js"></script>
<script type="text/javascript" src="/res/register/js/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="/res/register/js/bootstrap-datepicker.zh-CN.min.js"></script>
<body>
        <p>Hello world</p>


            <input type="text" class="datepicker" placeholder="请选择日期"/>
            <input type="text" class="datepicker" placeholder="请选择日期"/>
</body>
<script type="text/javascript">
    $(function () {
        $(".datepicker").datepicker({
            defaultDate : new Date(),
            language: "zh-CN",
            autoclose: true,//选中之后自动隐藏日期选择框
            clearBtn: true,//清除按钮
            todayBtn: 'linked',//今日按钮
            format: "yyyy-mm-dd"//日期格式，详见 http://bootstrap-datepicker.readthedocs.org/en/release/options.html#format
        });
    });
</script>
</html>