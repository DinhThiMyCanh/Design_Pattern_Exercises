package Facade;

public class ShopFacade {
	private static final ShopFacade INSTANCE = new ShopFacade();
	
	private AcountService acountService;
	private EmailService emailService;
	private ShippingService shippingService;
	private PaymentService paymentService;
	private SmsService smsService;
	
	private ShopFacade() {
		acountService = new AcountService();
		emailService = new EmailService();
		shippingService = new ShippingService();
		paymentService = new PaymentService();
		smsService = new SmsService();
	}
	
	public static ShopFacade getINSTANCE() {
		return INSTANCE;
	}
	
	public void buyProductFreeShip(String email) {
		acountService.getAccount(email);
		shippingService.freeShipping();
		paymentService.paymentByCash();
		emailService.sendEmail(email);
	}
	
	public void buyProductExpress(String email, String mobiFone) {
		acountService.getAccount(email);
		shippingService.expressShipping();
		paymentService.paymentByEbankingAccount();
		smsService.sendSMS(mobiFone);
	}
	
	
}
