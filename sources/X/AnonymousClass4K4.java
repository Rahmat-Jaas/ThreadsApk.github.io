package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4K4  reason: invalid class name */
public final class AnonymousClass4K4 implements C33884HwK, C39775Kzj, C85784vl {
    public List A00;
    public final C155649Ke A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean BS2() {
        return this.A01.BS2();
    }

    public final String getCategory() {
        return this.A01.getCategory();
    }

    public final String getErrorMessage() {
        return this.A01.getErrorMessage();
    }

    public final int getRetryCooldownTimeInMs() {
        return this.A01.getRetryCooldownTimeInMs();
    }

    public final String getStatus() {
        return this.A01.getStatus();
    }

    public final boolean isCheckpointRequired() {
        return this.A01.isCheckpointRequired();
    }

    public final boolean isConsentRequired() {
        return this.A01.isConsentRequired();
    }

    public final boolean isFeedbackRequired() {
        return this.A01.isFeedbackRequired();
    }

    public final boolean isLoginRequired() {
        return this.A01.isLoginRequired();
    }

    public final boolean isOk() {
        return this.A01.isOk();
    }

    /* renamed from: A00 */
    public final B6m D7H() {
        B6m b6m = this.A01.A04;
        if (b6m != null) {
            return b6m;
        }
        C18250wR.A0m();
        throw null;
    }

    public final long AUu() {
        return this.A01.A00;
    }

    public final long AUw() {
        return this.A01.A01;
    }

    public final Object Ags() {
        return null;
    }

    public final String AxY() {
        return this.A02;
    }

    public final String B5i() {
        return this.A03;
    }

    public final Integer B6h() {
        return null;
    }

    public final String B7T() {
        return null;
    }

    public final List B9R() {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean BOG() {
        return this.A04;
    }

    public final boolean BRb() {
        return true;
    }

    public final boolean BRi() {
        return false;
    }

    public final void CiS(long j) {
        this.A01.A00 = j;
    }

    public final void CiU(long j) {
        this.A01.A01 = j;
    }

    public final C62123Xf getCheckpoint() {
        return this.A01.mCheckpoint;
    }

    public final String getCheckpointUrl() {
        return this.A01.mCheckpointUrl;
    }

    public final C571339w getConsentData() {
        return this.A01.mConsentData;
    }

    public final String getDialogueType() {
        return this.A01.mDialogueType;
    }

    public final String getEnrollmentTime() {
        return this.A01.mEnrollmentTime;
    }

    public final String getErrorBody() {
        return this.A01.mErrorBody;
    }

    public final String getErrorCode() {
        return this.A01.mErrorCode;
    }

    public final String getErrorSource() {
        return this.A01.mErrorSource;
    }

    public final List getErrorStrings() {
        return this.A01.mErrorStrings;
    }

    public final String getErrorTitle() {
        return this.A01.mErrorTitle;
    }

    public final String getErrorType() {
        return this.A01.mErrorType;
    }

    public final String getExpirationTime() {
        return this.A01.mExpirationTime;
    }

    public final String getFeedbackAction() {
        return this.A01.mFeedbackAction;
    }

    public final String getFeedbackAppealLabel() {
        return this.A01.mFeedbackAppealLabel;
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A01.mFeedbackIgnoreLabel;
    }

    public final String getFeedbackMessage() {
        return this.A01.mFeedbackMessage;
    }

    public final String getFeedbackTitle() {
        return this.A01.mFeedbackTitle;
    }

    public final String getFeedbackUrl() {
        return this.A01.mFeedbackUrl;
    }

    public final String getLocalizedErrorMessage() {
        return this.A01.mLocalizedErrorMessage;
    }

    public final String getLogoutReason() {
        return this.A01.mLogoutReason;
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A01.mNewsURLIsRegulated.booleanValue();
    }

    public final String getReasonsThrown() {
        return this.A01.mReasonsThrown;
    }

    public final int getResponseId() {
        return this.A01.mResponseId;
    }

    public final String getResponsiblePolicy() {
        return this.A01.mResponsiblePolicy;
    }

    public final String getRestrictionDetailUseCase() {
        return this.A01.mRestrictionDetailUseCase;
    }

    public final String getRestrictionExtraData() {
        return this.A01.mRestrictionExtraData;
    }

    public final String getRestrictionType() {
        return this.A01.mRestrictionType;
    }

    public final boolean getRetryEntireUploadFlow() {
        return this.A01.mRetryEntireUploadFlow.booleanValue();
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A01.mSentryBlockRestrictionDialogueUnificationEnabled;
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A01.mLockCheckpointDialog;
    }

    public final boolean getSpam() {
        return this.A01.mSpam;
    }

    public final int getStatusCode() {
        return this.A01.mStatusCode;
    }

    public final List getSystemMessages() {
        return this.A01.mSystemMessages;
    }

    public final void setFromDiskCache(boolean z) {
        this.A01.mFromDiskCache = z;
    }

    public final void setResponseId(int i) {
        this.A01.mResponseId = i;
    }

    public final void setResponseTimestamp(long j) {
        this.A01.mResponseTimestamp = j;
    }

    public final void setServerElapsedTime(long j) {
        this.A01.mServerElapsedTime = j;
    }

    public final void setStatusCode(int i) {
        this.A01.mStatusCode = i;
    }

    public AnonymousClass4K4(C155649Ke r3) {
        this.A01 = r3;
        B6m b6m = r3.A04;
        if (b6m == null) {
            C18250wR.A0m();
            throw null;
        }
        this.A04 = b6m.A0F;
        this.A02 = b6m.A07;
        this.A03 = b6m.A09;
        this.A00 = AnonymousClass0wJ.A0v();
    }

    public final List getItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        B6m b6m = this.A01.A04;
        if (b6m == null) {
            C18250wR.A0m();
            throw null;
        }
        List list = b6m.A0E;
        if (list != null) {
            A0v.addAll(list);
        }
        A0v.addAll(this.A00);
        return AnonymousClass00J.A0N(A0v);
    }
}
