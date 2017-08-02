package com.hr.huarenlib.net.acition;

import android.content.Context;

/**
 * [A brief description]
 * 
 * @author
 * @version 1.0
 * @date 2014-11-13
 * 
 **/
public abstract class BaseAction {

	protected Context mContext;

	public BaseAction(Context mContext) {
		this.mContext = mContext;
	}
	//public static final String domain = "http://api-and-13.5262.com/";// 搬迁测试/
	//public static final String domain = "http://api-and-13.5262.com/";//生产环境
	public static final String domain = "http://api.test.com/"; // �?��环境
	//public static final String domain = "http://api-and.hrjk-p2p.com/"; // 外网测试环境/

	//public static final String domain = "http://api-and.hrjkp2p.com/";// 准生产环�?
	public static final String versionCode = "24";
	public static final String zerobuycalculate = "zeroBuy/calculate";
	public static final String domainUrl = "";
	// 活动广告
	public static final String banner = "banner";
	// 平台公告未读�?
	public static final String getUnReadMsgCount =  "message/getUnReadMsgCount";
	public static final String readMsg = "message/readMsg";
	// 首页产品列表
	public static final String product_list = "products";
	// 华人金融
	public static final String about = "about";
	// 理财产品列表
	public static final String financialList = "products/financialList";
	// 理财产品列表
	public static final String assignmentList = "transf/products";
	// 新注册获取验证码
	public static final String reg_get = "register";
	// 注册获取验证�?
	public static final String reg_get_yz = "register/authMobile";
	// 忘记密码获取验证�?
	public static final String reg_get_mm = "users/authMobileCode";
	// 注册
	public static final String reg_reg = "register/newUser";
	// 登陆
	public static final String login = "users/login";
	// 更新
	public static final String update = "versions";
	// 产品详细
	public static final String product_detil = "products/detail";
	// 60.债权转让产品详细接口
	public static final String product_assignment_detil = "transf/product_detail";
	// �?��登陆用户状�?接口
	public static final String checkUserStats = "assets/checkUserStats";

	// 推荐好友
	public static final String product_tj = "recomment/getShareQrImage";
	// 推荐好友
	public static final String product_lb = "recomment";
	// 帐户信息
	public static final String userinfo = "users/userinfo";
	// 资金流水
	public static final String assets = "assets/tradelist";
	// 资金管理
	public static final String manage = "assets/account";
	// 银行卡列�?
	public static final String bankcarlist = "users/userbanklist";
	// 银行卡删�?
	public static final String bankcardremove = "users/unBindCard";
	// 银行卡添�?
	public static final String bankcardCallback = "users/bindCardCallback";
	// 验证交易密码
	public static final String chkTradPwd = "assets/chkTradPwd";
	// 忘记交易密码
	public static final String jymmpwd = "users/forgetPayPwdAuthMobile";
	// 忘记交易校验手机验证�?
	public static final String jymmpwdyz = "users/authMobileCodeForPay";
	// 忘记交易校验手机验证�?
	public static final String jymmpwdnew = "users/setNewPayPwd";
	// 产品认购填写表单
	public static final String products_buy = "products/buy";
	// 61.债权转让产品购买接口
	public static final String transf_buying = "transf/buying";
	// 产品认购确认
	public static final String products_buying = "products/buying";
	// 投资管理
	public static final String assets_invest = "assets/invest";
	// 实名认证
	public static final String users_rz = "users/changeIdcard";
	// 交易密码验证
	public static final String userspass_rz = "users/verifyTradepw";
	// 设置交易密码
	public static final String userspass_sz = "users/setTradepw";
	// 连连 银行查询
	public static final String llbin = "payHelper/llbin";

	// 获取手机验证�?
	public static final String hqyzm = "users/getMobileVerify";
	// 验证手机验证�?
	public static final String yzPhone = "users/oldmobileVerify";
	// 绑定新手�?
	public static final String bandPhone = "users/changeMobile";
	// 用户反馈
	public static final String feedback = "feedback";
	// 消息接口
	public static final String message = "message/showmessages";
	// 充�?接口
	// public static final String recharge = "assets/recharge"; // 参数：tardepwd
	// 交易密码；money
	// 充�?数额; cardNum
	// 银行卡号
	// 绑定银行�?
	public static final String bankcardmodefy = "assets/bankcardmodefy";
	// 提现
	public static final String withdraw = "assets/withdraw";
	// �?��
	public static final String device = "device";
	// 新充值接�?
	public static final String rechargenew = "assets/rechargenew";
	// 提现银行省市区县选择
	// 银行
	public static final String bankinfo = "bankInfo";
	// 省份
	public static final String getbankprovlist = "bankInfo/getbankprovlist";
	// 市区
	public static final String getcitybyprov = "bankInfo/getcitybyprov";
	// 分行
	public static final String getbankbranch = "bankInfo/getbankbranch";
	// 获取验证�?
	public static final String forgetPwdAuthMobile = "users/forgetPwdAuthMobile";
	// 提交修改密码
	public static final String forgetSetNewPwd = "users/forgetSetNewPwd";
	// 银行卡列�?
	public static final String bankcardlist = "assets/bankCardListNew";
	// 收益还款方式
	public static final String getReturnType = "calculator/getReturnType";
	// 收益计算
	public static final String calculator = "calculator";
	// 红包管理
	public static final String hongbao_gl = "coupon";
	// 红包管理
	public static final String hongbao_tj = "coupon/addCoupon";

	// 宝付环境路径及其参数
	// 路径
	// public final static String URL_BAOFOO_GATEWAY_TEST =
	// "https://gw.baofoo.com/paysdk/index";
	// public final static String URL_BAOFOO_GATEWAY_TEST =
	// "http://gw.baofoo.com/paysdk/index";
	// 商户�?
	public static String MemberID = "403705";
	// public static String MemberID = "403705";
	// 终端�?
	// public static String TerminalID = "20991";
	public static String TerminalID = "20991";
	// mD5密匙
	public static String Md5Key = "zp2tpg8cbw36n4hm";

	// 回调路径
	public static String returnUrl = "https://users.5262.com/assets/baofooreturn.html";// 真实环境

	// public static String returnUrl =
	// "http://testuser.hrjk-p2p.com/assets/baofooreturn.html";// p2p

	// public static String Md5Key = "vrny52fqdxjrx6ar";
	// 连连支付模块
	// DES加密Key
	public static final String ALGORITHM_DES = "DES/ECB/PKCS5Padding";
	public static final String KEY = "hrjk5262"; // md5签名
	public static final String MD5SIGN = "payHelper/md5Sign";
	// 连连支付支持的银行及限额
	public static final String llbanksupport = "bankInfo/llbanksupport";
	public static final String recharge = "payHelper/recharge";
	public static final String cardMoney = "payHelper/cardMoney";
	public static final String cardBankBranch = "bankInfo/cardBankBranch";
	public static final String withDrawNew = "payHelper/withDrawNew";
	public static final String withdrawfee = "payHelper/withdrawfee";// 新提现手续费
	public static final String withdrawNotice = "payHelper/withdrawNotice";// 新提现说�?

	// 0元购产品详细
	public static final String zerobuy_product_details1 = "zeroBuy/productdetail";

	// 70.0元购可认购产品列表接口：
	public static final String zerobuy_calculate = "zeroBuyPre/calculate";
	//71.0元购可认购产品详细接口：
	public static final String zerobuy_product_details = "zeroBuyPre/productdetail";
	//72.0元购产品认购接口
	public static final String zerobuy_buying = "zeroBuyPre/buying";
	//73.0元购用户代金券订单详细接口：
	public static final String zerobuy_userCoupon = "zeroBuyPre/userCoupon";
	//债权转让
	public static final String transfer="transf/transfer";
	public static final String transferDetail="transf/transferDetail";
	public  static  final  String transfered="transf/transfered";
	public  static  final String cancel="transf/cancel";
	//0元购
	public static final String zeroIsopen= "zeroBuyPre/isopen";
	public static final String couponList = "zeroBuyPre/couponList";
	public static final String couponDetail="zeroBuyPre/couponDetail";
	public static final String couponStore="zeroBuyPre/couponStore";
	public static final String mypassport="zeroBuyPre/myPassport";
	public static final String crash="/message/crash";
	//是否为渠道管理员
	public static final String isAgentManager="recomment/isAgentManager";
	public static final String getAgentMQrCode="recomment/getAgentMQrCode";



	public static String getURL(String url) {
		StringBuilder builder = new StringBuilder(domain).append(url);
		return builder.toString();
	}
}
