/*
लेकिन अगर दो interfaces ने same default method override की है (जैसे show() या powerOn()), तो class को खुद ambiguity resolve करनी होती है

InterfaceName.super.method() — से आप clear बता सकते हो कि कौन सी method call करनी है

और new A(){}.method() — से आप original parent की method भी चला सकते हैं

=====================================================

means normaly diamon problem is not come it will only come with default method 
ChatGPT said:
जी हां, बिल्कुल सही! डायमंड प्रॉब्लम सामान्यत: तब नहीं आती जब सभी इंटरफेस में केवल एब्सट्रैक्ट मेथड्स (abstract methods) होते हैं। डायमंड प्रॉब्लम केवल तब होती है जब आप default मेथड्स का उपयोग करते हैं, क्योंकि यह स्थिति अस्पष्टता (ambiguity) पैदा कर सकती है।

*/

interface A {
    default void show() {
        System.out.println("A's show()");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B's show()");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C's show()");
    }
}

// D inherits from B and C — Ambiguity!
class D implements B, C {
    public void show() {
        // Java forces us to resolve the ambiguity manually
        B.super.show();  // or C.super.show()
        C.super.show();  // both can be called if needed
        System.out.println("D's own show()");
    }
}

public class DiamondProblemExample {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
