package X;

import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.633  reason: invalid class name */
public final class AnonymousClass633 extends AnonymousClass5NL implements C33915Hwv {
    public final User Ayz() {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) getTreeValueByHashCode(963379097, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            return new User(immutablePandoUserDict);
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final MediaVCRTappableData CzO(C144028hi r2) {
        return CzN(new C112176p7(r2));
    }

    public final boolean AW9() {
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-2048029722);
        if (optionalBooleanValueByHashCode != null) {
            return optionalBooleanValueByHashCode.booleanValue();
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String Afj() {
        return getStringValueByHashCode(-209971210);
    }

    public final Float Afq() {
        return A07(-557632268);
    }

    public final String Az0() {
        String A0A = A0A(-1970527703);
        if (A0A != null) {
            return A0A;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String Az1() {
        String stringValueByHashCode = getStringValueByHashCode(403787451);
        if (stringValueByHashCode != null) {
            return stringValueByHashCode;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String Az5() {
        String A0A = A0A(-1824429564);
        if (A0A != null) {
            return A0A;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String BDK() {
        return getStringValueByHashCode(-132220081);
    }

    public final Float BDR() {
        return A07(1106770299);
    }

    public final String BFu() {
        return getStringValueByHashCode(-2115337775);
    }

    public final MediaVCRTappableData CzN(C112176p7 r12) {
        boolean AW9 = AW9();
        String stringValueByHashCode = getStringValueByHashCode(-209971210);
        return new MediaVCRTappableData((User) r12.A00(Ayz()), A07(-557632268), A07(1106770299), stringValueByHashCode, Az0(), Az1(), Az5(), getStringValueByHashCode(-132220081), getStringValueByHashCode(-2115337775), AW9);
    }
}
