package X;

import java.util.BitSet;
import java.util.Map;

/* renamed from: X.3FE  reason: invalid class name */
public abstract class AnonymousClass3FE {
    public int A00 = 720000263;
    public long A01;
    public final Map A02 = C18220wO.A0y();

    public final void A00() {
        BitSet bitSet;
        int i;
        boolean z = this instanceof AnonymousClass144;
        if (z) {
            bitSet = ((AnonymousClass144) this).A00;
        } else if (this instanceof AnonymousClass143) {
            bitSet = ((AnonymousClass143) this).A00;
        } else if (this instanceof AnonymousClass142) {
            bitSet = ((AnonymousClass142) this).A00;
        } else if (this instanceof AnonymousClass141) {
            bitSet = ((AnonymousClass141) this).A00;
        } else {
            bitSet = ((AnonymousClass140) this).A00;
        }
        int nextClearBit = bitSet.nextClearBit(0);
        if (z || !(this instanceof AnonymousClass143)) {
            i = 0;
        } else {
            i = 2;
        }
        if (nextClearBit < i) {
            throw C18180wK.A0a("Missing required params");
        }
    }
}
