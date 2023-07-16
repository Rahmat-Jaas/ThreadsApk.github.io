package X;

import com.facebook.pando.Summary;

/* renamed from: X.5z0  reason: invalid class name */
public final class AnonymousClass5z0 extends C685344e implements C28104Eyb, C143338gY {
    public final Summary A00;
    public final Object A01;
    public final long A02 = System.currentTimeMillis();

    public final Integer Aju() {
        String str;
        String str2;
        if (!(this.A01 == null || (str = this.A00.source) == null)) {
            switch (str.hashCode()) {
                case 461569884:
                    if (str.equals("stale_cache")) {
                        return AnonymousClass006.A0C;
                    }
                    break;
                case 1561714200:
                    str2 = "consistency";
                    break;
                case 1782559025:
                    str2 = "fresh_cache";
                    break;
                case 1843485230:
                    if (str.equals("network")) {
                        return AnonymousClass006.A00;
                    }
                    break;
            }
            if (str.equals(str2)) {
                return AnonymousClass006.A01;
            }
        }
        return AnonymousClass006.A0N;
    }

    public final boolean BS2() {
        Summary summary = this.A00;
        if (C04220Ms.A0I(summary.source, "stale_cache") || C04220Ms.A0I(summary.source, "fresh_cache")) {
            return true;
        }
        return false;
    }

    public final void CiS(long j) {
        throw C86134wK.A0s("setCacheReadLatency not supported for IGGraphQLResult");
    }

    public final void CiU(long j) {
        throw C86134wK.A0s("setCachedResponseTimeStamp not supported for IGGraphQLResult");
    }

    public AnonymousClass5z0(Summary summary, Object obj, int i) {
        this.A01 = obj;
        this.A00 = summary;
        String str = summary.source;
        if (C04220Ms.A0I(str, "stale_cache") || C04220Ms.A0I(str, "fresh_cache")) {
            this.mFromDiskCache = true;
        }
        this.mStatusCode = i;
    }

    public static Object A00(C26743EUq eUq) {
        return ((AnonymousClass5z0) eUq.A03()).A01;
    }

    public final long AUu() {
        if (!BS2()) {
            return -1;
        }
        Summary summary = this.A00;
        return summary.cacheEndTime - summary.cacheStartTime;
    }

    public final long AUw() {
        if (!BS2()) {
            return -1;
        }
        return this.A02 - this.A00.cacheAge;
    }
}
