/**
 * 定义一个函数对象（相当于一个 Java 类）
 */
var Validate = function () {

    /**
     * 定义了一个私有函数（外部无法调用）
     */
    function initValidate() {
        // 手机号码验证
        $.validator.addMethod("mobile", function(value, element) {
            var length = value.length;
            var mobile =  /^(((13[0-9]{1})|(15[0-9]{1}))+\d{8})$/;
            return this.optional(element) || (length == 11 && mobile.test(value));
        }, "手机号码格式错误");

        // 通过 js 引入样式
        $(function () {
            $("#inputForm").validate({
                errorElement: 'span',
                errorClass: 'help-block',

                errorPlacement: function (error, element) {
                    element.parent().parent().attr("class", "form-group has-error");
                    error.insertAfter(element);
                }
            });
        });
    }

    return{
        initValidate : function () {
            initValidate()
        }
    }

}();

/**
 * 每当引入了当前的 js 文件时，都会在页面中自动执行初始化动作
 */
$(document).ready(function () {
    Validate.initValidate();
})