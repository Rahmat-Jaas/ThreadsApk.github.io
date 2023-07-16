package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.432  reason: invalid class name */
public final class AnonymousClass432 implements C21835C2k, C85784vl {
    public final C28081td A00;
    public final AnonymousClass423 A01;

    public AnonymousClass432(C144028hi r11, C28081td r12) {
        ArrayList arrayList;
        C04220Ms.A0B(r11, 2);
        this.A00 = r12;
        C27721t3 r2 = (C27721t3) r12.A00.reinterpret(C27721t3.class);
        C112176p7 r4 = new C112176p7(r11);
        List<C84014sP> AXm = r2.AXm();
        ArrayList arrayList2 = null;
        if (AXm != null) {
            arrayList = AnonymousClass0wJ.A0x(AXm, 10);
            for (C84014sP Cy6 : AXm) {
                arrayList.add(Cy6.Cy6(r4));
            }
        } else {
            arrayList = null;
        }
        r2.getStringValueByHashCode(1759802346);
        r2.getStringValueByHashCode(235795787);
        Iterable<C84014sP> optionalTreeListByHashCode = r2.getOptionalTreeListByHashCode(100526016, C27651sw.class);
        optionalTreeListByHashCode = optionalTreeListByHashCode == null ? AnonymousClass0ZV.A00 : optionalTreeListByHashCode;
        ArrayList A0x = AnonymousClass0wJ.A0x(optionalTreeListByHashCode, 10);
        for (C84014sP Cy62 : optionalTreeListByHashCode) {
            A0x.add(Cy62.Cy6(r4));
        }
        ImmutableList<C82054p0> optionalTreeListByHashCode2 = r2.getOptionalTreeListByHashCode(-1339914410, C162169f5.class);
        if (optionalTreeListByHashCode2 != null) {
            arrayList2 = AnonymousClass0wJ.A0x(optionalTreeListByHashCode2, 10);
            for (C82054p0 Cy7 : optionalTreeListByHashCode2) {
                arrayList2.add(Cy7.Cy7(r4));
            }
        }
        C84054sT r1 = (C27781t9) r2.getTreeValueByHashCode(1726143873, C27781t9.class);
        this.A01 = new AnonymousClass423((r1 == null ? new C1535898l((String) null, false) : r1).Czn(), r2.getOptionalBooleanValueByHashCode(2079275687), r2.getStringValueByHashCode(-1198642808), r2.getStringValueByHashCode(37109963), arrayList, A0x, arrayList2);
    }

    public final boolean BS2() {
        return this.A00.BS2();
    }

    public final String getCategory() {
        return this.A00.getCategory();
    }

    public final String getCheckpointUrl() {
        return this.A00.getCheckpointUrl();
    }

    public final String getDialogueType() {
        return this.A00.getDialogueType();
    }

    public final String getEnrollmentTime() {
        return this.A00.getEnrollmentTime();
    }

    public final String getErrorBody() {
        return this.A00.getErrorBody();
    }

    public final String getErrorCode() {
        return this.A00.getErrorCode();
    }

    public final String getErrorSource() {
        return this.A00.getErrorSource();
    }

    public final String getErrorTitle() {
        return this.A00.getErrorTitle();
    }

    public final String getErrorType() {
        return this.A00.getErrorType();
    }

    public final String getExpirationTime() {
        return this.A00.getExpirationTime();
    }

    public final String getFeedbackAction() {
        return this.A00.getFeedbackAction();
    }

    public final String getFeedbackAppealLabel() {
        return this.A00.getFeedbackAppealLabel();
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A00.getFeedbackIgnoreLabel();
    }

    public final String getFeedbackMessage() {
        return this.A00.getFeedbackMessage();
    }

    public final String getFeedbackTitle() {
        return this.A00.getFeedbackTitle();
    }

    public final String getFeedbackUrl() {
        return this.A00.getFeedbackUrl();
    }

    public final String getLocalizedErrorMessage() {
        return this.A00.getLocalizedErrorMessage();
    }

    public final String getLogoutReason() {
        return this.A00.getLogoutReason();
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A00.getNewsURLIsRegulated();
    }

    public final String getReasonsThrown() {
        return this.A00.getReasonsThrown();
    }

    public final String getResponsiblePolicy() {
        return this.A00.getResponsiblePolicy();
    }

    public final String getRestrictionDetailUseCase() {
        return this.A00.getRestrictionDetailUseCase();
    }

    public final String getRestrictionExtraData() {
        return this.A00.getRestrictionExtraData();
    }

    public final String getRestrictionType() {
        return this.A00.getRestrictionType();
    }

    public final int getRetryCooldownTimeInMs() {
        return this.A00.getRetryCooldownTimeInMs();
    }

    public final boolean getRetryEntireUploadFlow() {
        return this.A00.getRetryEntireUploadFlow();
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A00.getSentryBlockRestrictionDialogueUnificationEnabled();
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return this.A00.getShouldShowWebviewCancelButton();
    }

    public final boolean getSpam() {
        return this.A00.getSpam();
    }

    public final String getStatus() {
        return this.A00.getStatus();
    }

    public final boolean isFeedbackRequired() {
        return this.A00.isFeedbackRequired();
    }

    public final boolean isOk() {
        return this.A00.isOk();
    }

    public final long AUu() {
        return this.A00.A00;
    }

    public final long AUw() {
        return this.A00.A01;
    }

    public final List AXn() {
        List<C1534397w> list = this.A01.A05;
        if (list == null) {
            return AnonymousClass0ZV.A00;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (C1534397w A02 : list) {
            AnonymousClass9CZ A022 = C19515Axc.A02(A02);
            if (A022 != null) {
                A0v.add(A022);
            }
        }
        return A0v;
    }

    public final List AXo() {
        List list = this.A01.A05;
        if (list == null) {
            return AnonymousClass0ZV.A00;
        }
        return list;
    }

    public final List AXq() {
        List<AnonymousClass422> list = this.A01.A04;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (AnonymousClass422 A012 : list) {
            A0w.add(C19515Axc.A01(A012));
        }
        return A0w;
    }

    public final String AxY() {
        return this.A01.A00.Ata();
    }

    public final String Azq() {
        return this.A01.A02;
    }

    public final C84054sT Azu() {
        return this.A01.A00;
    }

    public final boolean BRb() {
        return this.A01.A00.AwS();
    }

    public final void CiS(long j) {
        this.A00.A00 = j;
    }

    public final void CiU(long j) {
        this.A00.A01 = j;
    }

    public final /* bridge */ /* synthetic */ Object D7H() {
        return this.A00.A00.reinterpret(C27721t3.class);
    }

    public final C62123Xf getCheckpoint() {
        return null;
    }

    public final C571339w getConsentData() {
        return null;
    }

    public final String getErrorMessage() {
        return null;
    }

    public final List getErrorStrings() {
        return null;
    }

    public final int getResponseId() {
        return this.A00.mResponseId;
    }

    public final int getStatusCode() {
        return this.A00.mStatusCode;
    }

    public final List getSystemMessages() {
        return null;
    }

    public final boolean isCheckpointRequired() {
        return false;
    }

    public final boolean isConsentRequired() {
        return false;
    }

    public final boolean isLoginRequired() {
        return false;
    }

    public final void setFromDiskCache(boolean z) {
        this.A00.mFromDiskCache = z;
    }

    public final void setResponseId(int i) {
        this.A00.mResponseId = i;
    }

    public final void setResponseTimestamp(long j) {
        this.A00.mResponseTimestamp = j;
    }

    public final void setServerElapsedTime(long j) {
        this.A00.mServerElapsedTime = j;
    }

    public final void setStatusCode(int i) {
        this.A00.mStatusCode = i;
    }

    public final boolean BRi() {
        if (!C04220Ms.A0I(AxY(), "0")) {
            List list = this.A01.A04;
            if (!C18190wL.A1a(list) || ((AnonymousClass422) list.get(0)).A00.A0f.A6e == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean BZN() {
        return C18180wK.A0Y().equals(this.A01.A01);
    }
}
