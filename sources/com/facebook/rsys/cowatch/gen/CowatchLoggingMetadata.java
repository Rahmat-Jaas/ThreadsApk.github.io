package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchLoggingMetadata {
    public final String promotionSource;
    public final int sectionItemRenderingStyle;
    public final int sectionRenderingStyle;
    public final String tabLoggingName;

    public static native CowatchLoggingMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchLoggingMetadata)) {
                return false;
            }
            CowatchLoggingMetadata cowatchLoggingMetadata = (CowatchLoggingMetadata) obj;
            String str = this.tabLoggingName;
            String str2 = cowatchLoggingMetadata.tabLoggingName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.promotionSource;
            String str4 = cowatchLoggingMetadata.promotionSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.sectionRenderingStyle == cowatchLoggingMetadata.sectionRenderingStyle && this.sectionItemRenderingStyle == cowatchLoggingMetadata.sectionItemRenderingStyle)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((C18210wN.A00(AnonymousClass0wJ.A06(this.tabLoggingName)) + C18200wM.A09(this.promotionSource)) * 31) + this.sectionRenderingStyle) * 31) + this.sectionItemRenderingStyle;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CowatchLoggingMetadata{tabLoggingName=");
        A0s.append(this.tabLoggingName);
        A0s.append(",promotionSource=");
        A0s.append(this.promotionSource);
        A0s.append(",sectionRenderingStyle=");
        A0s.append(this.sectionRenderingStyle);
        A0s.append(",sectionItemRenderingStyle=");
        A0s.append(this.sectionItemRenderingStyle);
        return C18180wK.A0i("}", A0s);
    }

    public CowatchLoggingMetadata(String str, String str2, int i, int i2) {
        this.tabLoggingName = str;
        this.promotionSource = str2;
        this.sectionRenderingStyle = i;
        this.sectionItemRenderingStyle = i2;
    }
}
