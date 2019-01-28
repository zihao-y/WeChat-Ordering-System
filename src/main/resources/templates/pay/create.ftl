<script>
    function onBridgeReady(){
        WeixinJSBridge.invoke(
                'getBrandWCPayRequest', {
                    "appId":"${payResponse.appId}",     //Name of the public account, passed by seller
                    "timeStamp":"${payResponse.timeStamp}",         //Time stamp, from 1970
                    "nonceStr":"${payResponse.nonceStr}", //Random sequence
                    "package":"${payResponse.packAge}",
                    "signType":"MD5",         //WeChat signature type
                    "paySign":"${payResponse.paySign}" //WeChat signature
                },
                function(res){
//                    if(res.err_msg == "get_brand_wcpay_request:ok" ) {

//                    }
                    location.href = "${returnUrl}";
                }
        );
    }
    if (typeof WeixinJSBridge == "undefined"){
        if( document.addEventListener ){
            document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
        }else if (document.attachEvent){
            document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
            document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
        }
    }else{
        onBridgeReady();
    }
</script>