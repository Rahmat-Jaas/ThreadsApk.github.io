package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass3I0;
import X.C04220Ms;
import X.C18210wN;

public final class SandboxErrorInfo extends AnonymousClass0Sf {
    public final String logMessage;
    public final AnonymousClass3I0 message;
    public final AnonymousClass3I0 title;

    public static /* synthetic */ SandboxErrorInfo copy$default(SandboxErrorInfo sandboxErrorInfo, AnonymousClass3I0 r2, AnonymousClass3I0 r3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            r2 = sandboxErrorInfo.title;
        }
        if ((i & 2) != 0) {
            r3 = sandboxErrorInfo.message;
        }
        if ((i & 4) != 0) {
            str = sandboxErrorInfo.logMessage;
        }
        return sandboxErrorInfo.copy(r2, r3, str);
    }

    public final AnonymousClass3I0 component1() {
        return this.title;
    }

    public final AnonymousClass3I0 component2() {
        return this.message;
    }

    public final String component3() {
        return this.logMessage;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SandboxErrorInfo) {
                SandboxErrorInfo sandboxErrorInfo = (SandboxErrorInfo) obj;
                if (!C04220Ms.A0I(this.title, sandboxErrorInfo.title) || !C04220Ms.A0I(this.message, sandboxErrorInfo.message) || !C04220Ms.A0I(this.logMessage, sandboxErrorInfo.logMessage)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public final String getLogMessage() {
        return this.logMessage;
    }

    public final AnonymousClass3I0 getMessage() {
        return this.message;
    }

    public final AnonymousClass3I0 getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C18210wN.A05(this.logMessage, AnonymousClass0wJ.A05(this.message, C18210wN.A04(this.title)));
    }

    public SandboxErrorInfo(AnonymousClass3I0 r2, AnonymousClass3I0 r3, String str) {
        AnonymousClass0wJ.A1O(r2, r3);
        C04220Ms.A0B(str, 3);
        this.title = r2;
        this.message = r3;
        this.logMessage = str;
    }

    public final SandboxErrorInfo copy(AnonymousClass3I0 r2, AnonymousClass3I0 r3, String str) {
        AnonymousClass0wJ.A1N(r2, r3);
        C04220Ms.A0B(str, 2);
        return new SandboxErrorInfo(r2, r3, str);
    }
}
