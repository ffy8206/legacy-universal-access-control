	$(document).ready( function() {
		//if($("ul[class='tree treeFolder treeCheck collapse']")[0].innerHTML == "") {
			bindTree();
		//}
	});

	function addChildren(json) {
		var parentOrgID = json.orgID;
		var parentOrgCodeNo = json.orgCodeNo;
		var parentOrgName = json.orgName;
		var rootParent = "ul[class='tree treeFolder treeCheck collapse']";

		//create parent node
		//if(parentOrgID == "-1")//root node
//		if($(rootParent)[0].innerHTML == "")	
//			{
//				$(rootParent).append(createNode(parentOrgID, parentOrgName, parentOrgCodeNo));
//			}
		if(json.pid == "") {
			$(rootParent).append(createNode(parentOrgID, parentOrgName, parentOrgCodeNo));
		}
		
		//var parentNode = $("a[tname='" + parentOrgID + "']");
		var parentNode = $("a[tvalue='" + getJson4TreeCode(parentOrgID, parentOrgName, parentOrgCodeNo) + "']");
		var ulNode = null;
		//add children
		if(json.children.length != 0) {
			var children = json.children;
			$.each(children, function(n, value) {
				if(n == 0)
				{
					parentNode.after("<ul id='" + value.orgID + "'></ul>");
					ulNode = $("ul[id='" + value.orgID + "']");
				}
				ulNode.append(createNode(value.orgID, value.orgName, value.orgCodeNo));
				
				if(value.children.length != 0)
					addChildren(value);
			});
		}
			
	}
	function createNode(orgID, orgName, orgCodeNo) {
		var json = getJson4TreeCode(orgID, orgName, orgCodeNo);
		//json = "2";
		//alert(json);
		return "<li><a href=\"\" tname='orgId' tvalue=\"" + json + "\">"+ orgName +"</a></li>";
		//return "<li><a href=\"\" tname='" + "xx" + "' tvalue=\"" + json + "\">"+ orgName +"</a></li>";
	}
	function bindTree() {
		$.ajax({
			type:'GET',
			url:'../common/getOrgTreeJsonData',
			data:{"parentOrgId":$("input[name='parentOrgId']").val()},
			dataType:'json',
			timeout: 50000,
			cache: false,
			async: false,
			
			success: function(json){
				var json = eval("(" + json.orgTreeData + ")");
				for (var i=0;i<json.length;i++) {
					addChildren(json[i]);
				}
			}
		});
	}
	
	function getJson4TreeCode(orgID, orgName, orgCodeNo) {
		var lookup = $.fn.retLookup();
		lookup = lookup.pk || "orgCode";
		return "{"+lookup+":'" + orgCodeNo +"', orgName:'" + orgName +"', id:'" + orgID +"'}";
	}
	
	function ajaxDialogSearchDone(json, refreshBox) {
		refreshBox.append(createOrgTable(json));
	}
	function createOrgTable(json) {
		var json = eval("(" + json.json4queriedOrgs + ")");
		var html = "";
		$.each(json, function(i, n){
			if(i == 0) {
				html += "<tr>";
			}
			html += "<td width='4px'><input type='checkbox' name='orgId' value=\"" + getJson4TreeCode(json[i].orgId, json[i].orgName, json[i].orgCode) + "\"/></td>"
		+ "<td width='33px'>" + json[i].orgCode + "</td><td width='52px'>"+ json[i].orgName +"</td><td width='20px'>"+ json[i].orgManagerUid +"</td><td width='26px'>"+ json[i].createUserId +"</td>";
			if(i == json.length - 1) {
				html += "</tr>";
			}
		});
		return html;
	}