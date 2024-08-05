/**
 * 
 */
  $(document).ready(function() {
            $("#batchUserImport_fileUpload").uploadify({
                /*注意前面需要书写path的代码*/
                'uploader'       : '../js/uploadify/scripts/uploadify.swf',
                'script'         : '../batchusermgt/uploadFile',
                'cancelImg'      : '../js/uploadify/cancel.png',
                'queueID'        : 'batchUserImport_fileQueue', //和存放队列的DIV的id一致
                'fileDataName'   : 'fileUpload', //和以下input的name属性一致
                'auto'           : false, //是否自动开始
                'multi'          : true, //是否支持多文件上传
                'buttonText'     : 'Browse', //按钮上的文字
                'simUploadLimit' : 1, //一次同步上传的文件数目
                'sizeLimit'      : 19871202, //设置单个文件大小限制
                'queueSizeLimit' : 1, //队列中同时存在的文件个数限制
                'fileDesc'       : '*.xls', //如果配置了以下的'fileExt'属性，那么这个属性是必须的
                'fileExt'        : '*.xls',//允许的格式  
            onComplete: function (event, queueID, fileObj, response, data) {
            	//$('<li></li>').appendTo('.files').text(response);
            	//alertMsg.correct('文件上传成功!');
            	},
            onError: function(event, queueID, fileObj) {
            	alertMsg.error('文件:' + fileObj.name + " 上传失败");
            	}
//            onCancel: function(event, queueID, fileObj){
//            	alert("您取消了" + fileObj.name);
//            }
          });

}); 
  
  function uploadifyUpload(){
	   $('#batchUserImport_fileUpload').uploadifyUpload();
	}
  
  function cacelAllUpload() {
	  $('#batchUserImport_fileUpload').uploadifyClearQueue();
}
