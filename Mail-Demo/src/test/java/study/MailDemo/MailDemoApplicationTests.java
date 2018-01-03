package study.MailDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.service.MailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailDemoApplicationTests {

	@Autowired
	private MailService mailService;

	String to = "1798910866@qq.com";

	String content = "<!DOCTYPE html>\n" +
			"<html>\n" +
			"\t<head>\n" +
			"\t\t<meta charset=\"utf-8\" />\n" +
			"\t\t<title>测试LayUI</title>\n" +
			"\t\t<script type=\"text/javascript\" src=\"js/layui.js\" ></script>\n" +
			"\t\t<link rel=\"stylesheet\" href=\"//res.layui.com/lay/v1/build/css/layui.css\"  media=\"all\">\n" +
			"\t</head>\n" +
			"\t\n" +
			"\t<script>\n" +
			"\t\t//Demo\n" +
			"\t\tlayui.use(['form','element'], function(){\n" +
			"\t\t  var form = layui.form();\n" +
			"\t\t  var element = layui.element()\n" +
			"\t\t  \n" +
			"\t\t  //监听提交\n" +
			"\t\t  form.on('submit(formDemo)', function(data){\n" +
			"\t\t    layer.msg(JSON.stringify(data.field));\n" +
			"\t\t    return false;\n" +
			"\t\t  });\n" +
			"\t\t});\n" +
			"\t\t</script>\n" +
			"      \n" +
			"\t<body>\n" +
			"layui.code\n" +
			"\t\t<form class=\"layui-form\" action=\"\">\n" +
			"\t\t  <div class=\"layui-form-item\">\n" +
			"\t\t    <label class=\"layui-form-label\">输入框</label>\n" +
			"\t\t    <div class=\"layui-input-block\">\n" +
			"\t\t      <input type=\"text\" name=\"title\" required  lay-verify=\"required\" placeholder=\"请输入标题\" autocomplete=\"off\" class=\"layui-input\">\n" +
			"\t\t    </div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-form-item\">\n" +
			"\t\t    <label class=\"layui-form-label\">密码框</label>\n" +
			"\t\t    <div class=\"layui-input-inline\">\n" +
			"\t\t      <input type=\"password\" name=\"password\" required lay-verify=\"required\" placeholder=\"请输入密码\" autocomplete=\"off\" class=\"layui-input\">\n" +
			"\t\t    </div>\n" +
			"\t\t    <div class=\"layui-form-mid layui-word-aux\">辅助文字</div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-form-item\">\n" +
			"\t\t    <label class=\"layui-form-label\">选择框</label>\n" +
			"\t\t    <div class=\"layui-input-block\">\n" +
			"\t\t      <select name=\"city\" lay-verify=\"required\">\n" +
			"\t\t        <option value=\"\"></option>\n" +
			"\t\t        <option value=\"0\">北京</option>\n" +
			"\t\t        <option value=\"1\">上海</option>\n" +
			"\t\t        <option value=\"2\">广州</option>\n" +
			"\t\t        <option value=\"3\">深圳</option>\n" +
			"\t\t        <option value=\"4\">杭州</option>\n" +
			"\t\t      </select>\n" +
			"\t\t    </div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-form-item\">\n" +
			"\t\t    <label class=\"layui-form-label\">复选框</label>\n" +
			"\t\t    <div class=\"layui-input-block\">\n" +
			"\t\t      <input type=\"checkbox\" name=\"like[write]\" title=\"写作\">\n" +
			"\t\t      <input type=\"checkbox\" name=\"like[read]\" title=\"阅读\" checked>\n" +
			"\t\t      <input type=\"checkbox\" name=\"like[dai]\" title=\"发呆\">\n" +
			"\t\t    </div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-form-item\">\n" +
			"\t\t    <label class=\"layui-form-label\">开关</label>\n" +
			"\t\t    <div class=\"layui-input-block\">\n" +
			"\t\t      <input type=\"checkbox\" name=\"switch\" lay-skin=\"switch\">\n" +
			"\t\t    </div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-form-item\">\n" +
			"\t\t    <label class=\"layui-form-label\">单选框</label>\n" +
			"\t\t    <div class=\"layui-input-block\">\n" +
			"\t\t      <input type=\"radio\" name=\"sex\" value=\"男\" title=\"男\">\n" +
			"\t\t      <input type=\"radio\" name=\"sex\" value=\"女\" title=\"女\" checked>\n" +
			"\t\t    </div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-form-item layui-form-text\">\n" +
			"\t\t    <label class=\"layui-form-label\">文本域</label>\n" +
			"\t\t    <div class=\"layui-input-block\">\n" +
			"\t\t      <textarea name=\"desc\" placeholder=\"请输入内容\" class=\"layui-textarea\"></textarea>\n" +
			"\t\t    </div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-form-item\">\n" +
			"\t\t    <div class=\"layui-input-block\">\n" +
			"\t\t      <button class=\"layui-btn\" lay-submit lay-filter=\"formDemo\">立即提交</button>\n" +
			"\t\t      <button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\n" +
			"\t\t    </div>\n" +
			"\t\t  </div>\n" +
			"\t\t</form>\n" +
			" \t\t\n" +
			" \t\t\n" +
			" \t\t<!--選項卡-->\n" +
			"\t\t<div class=\"layui-tab\">\n" +
			"\t\t  <ul class=\"layui-tab-title\">\n" +
			"\t\t    <li class=\"layui-this\">网站设置</li>\n" +
			"\t\t    <li>用户管理</li>\n" +
			"\t\t    <li>权限分配</li>\n" +
			"\t\t    <li>商品管理</li>\n" +
			"\t\t    <li>订单管理</li>\n" +
			"\t\t  </ul>\n" +
			"\t\t  <div class=\"layui-tab-content\">\n" +
			"\t\t    <div class=\"layui-tab-item layui-show\">内容1</div>\n" +
			"\t\t    <div class=\"layui-tab-item\">内容2</div>\n" +
			"\t\t    <div class=\"layui-tab-item\">内容3</div>\n" +
			"\t\t    <div class=\"layui-tab-item\">内容4</div>\n" +
			"\t\t    <div class=\"layui-tab-item\">内容5</div>\n" +
			"\t\t  </div>\n" +
			"\t\t</div>\n" +
			"\t\t\n" +
			"\t\t<!--进度条-->\n" +
			"\t\tL结构layui.code\n" +
			"\t\t<div class=\"layui-progress\" lay-showPercent=\"yes\">\n" +
			"\t\t  <div class=\"layui-progress-bar layui-bg-red\" lay-percent=\"30%\"></div>\n" +
			"\t\t</div>\n" +
			"\t\t \n" +
			"\t\t<div class=\"layui-progress layui-progress-big\" lay-showPercent=\"yes\">\n" +
			"\t\t  <div class=\"layui-progress-bar layui-bg-green\" lay-percent=\"50%\"></div>\n" +
			"\t\t</div>\n" +
			"\t\t      \n" +
			"\t\t<!--手风琴-->\n" +
			"\t\t<div class=\"layui-collapse\" lay-accordion>\n" +
			"\t\t  <div class=\"layui-colla-item\">\n" +
			"\t\t    <h2 class=\"layui-colla-title\">杜甫</h2>\n" +
			"\t\t    <div class=\"layui-colla-content layui-show\">内容区域</div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-colla-item\">\n" +
			"\t\t    <h2 class=\"layui-colla-title\">李清照</h2>\n" +
			"\t\t    <div class=\"layui-colla-content layui-show\">内容区域</div>\n" +
			"\t\t  </div>\n" +
			"\t\t  <div class=\"layui-colla-item\">\n" +
			"\t\t    <h2 class=\"layui-colla-title\">鲁迅</h2>\n" +
			"\t\t    <div class=\"layui-colla-content \">内容区域</div>\n" +
			"\t\t  </div>\n" +
			"\t\t</div>\n" +
			"\t\t\n" +
			"\t</body>\n" +
			"\t\n" +
			"\t\n" +
			"\t\n" +
			"</html>\n";
	@Test
	public void contextLoads() {
		// mailService.sendSimpleMail(to, "主题：简单邮件", "测试邮件内容");
		// mailService.sendHtmlMail(to,"微微一笑很倾城", content);
		for (int i = 0;i < 1000 ; i++) {
			mailService.sendInlineResourceMail(to, "微微一笑很倾城", "你猜这是谁？", "C:\\Users\\fengqigui\\Desktop\\12.jpg", "12.jpg", "" + i + ".jpg");
		}
	}

}
