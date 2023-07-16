package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.421  reason: invalid class name */
public final class AnonymousClass421 implements C85794vm, C28104Eyb, C39775Kzj, C27703Ert {
    public long A00 = -1;
    public long A01 = -1;
    public final AnonymousClass1R6 A02;

    public final String getCategory() {
        return this.A02.getCategory();
    }

    public final String getErrorMessage() {
        return this.A02.getErrorMessage();
    }

    public final int getRetryCooldownTimeInMs() {
        return this.A02.getRetryCooldownTimeInMs();
    }

    public final String getStatus() {
        return this.A02.getStatus();
    }

    public final boolean isCheckpointRequired() {
        return this.A02.isCheckpointRequired();
    }

    public final boolean isConsentRequired() {
        return this.A02.isConsentRequired();
    }

    public final boolean isFeedbackRequired() {
        return this.A02.isFeedbackRequired();
    }

    public final boolean isLoginRequired() {
        return this.A02.isLoginRequired();
    }

    public final boolean isOk() {
        return this.A02.isOk();
    }

    public final long AUu() {
        return this.A00;
    }

    public final long AUw() {
        return this.A01;
    }

    public final String AxY() {
        return null;
    }

    public final boolean BRb() {
        return true;
    }

    public final boolean BRi() {
        return false;
    }

    public final boolean BS2() {
        return C18180wK.A1V((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1)));
    }

    public final CnY CxJ() {
        CnY cnY = new CnY();
        AnonymousClass33C r0 = this.A02.A00;
        if (r0 == null) {
            C18250wR.A0m();
            throw null;
        }
        List<C90155Ks> list = r0.A00;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        for (C90155Ks r1 : list) {
            A0w.add(new AnonymousClass7HP((C145458kX) r1));
        }
        cnY.A00 = A0w;
        C102016Tm.A00(A0w, cnY.A02);
        return cnY;
    }

    public final /* bridge */ /* synthetic */ Object D7H() {
        AnonymousClass33C r0 = this.A02.A00;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0m();
        throw null;
    }

    public final C62123Xf getCheckpoint() {
        return this.A02.mCheckpoint;
    }

    public final String getCheckpointUrl() {
        return this.A02.mCheckpointUrl;
    }

    public final C571339w getConsentData() {
        return this.A02.mConsentData;
    }

    public final String getDialogueType() {
        return this.A02.mDialogueType;
    }

    public final String getEnrollmentTime() {
        return this.A02.mEnrollmentTime;
    }

    public final String getErrorBody() {
        return this.A02.mErrorBody;
    }

    public final String getErrorCode() {
        return this.A02.mErrorCode;
    }

    public final String getErrorSource() {
        return this.A02.mErrorSource;
    }

    public final List getErrorStrings() {
        return this.A02.mErrorStrings;
    }

    public final String getErrorTitle() {
        return this.A02.mErrorTitle;
    }

    public final String getErrorType() {
        return this.A02.mErrorType;
    }

    public final String getExpirationTime() {
        return this.A02.mExpirationTime;
    }

    public final String getFeedbackAction() {
        return this.A02.mFeedbackAction;
    }

    public final String getFeedbackAppealLabel() {
        return this.A02.mFeedbackAppealLabel;
    }

    public final String getFeedbackIgnoreLabel() {
        return this.A02.mFeedbackIgnoreLabel;
    }

    public final String getFeedbackMessage() {
        return this.A02.mFeedbackMessage;
    }

    public final String getFeedbackTitle() {
        return this.A02.mFeedbackTitle;
    }

    public final String getFeedbackUrl() {
        return this.A02.mFeedbackUrl;
    }

    public final String getLocalizedErrorMessage() {
        return this.A02.mLocalizedErrorMessage;
    }

    public final String getLogoutReason() {
        return this.A02.mLogoutReason;
    }

    public final boolean getNewsURLIsRegulated() {
        return this.A02.mNewsURLIsRegulated.booleanValue();
    }

    public final String getReasonsThrown() {
        return this.A02.mReasonsThrown;
    }

    public final int getResponseId() {
        return this.A02.mResponseId;
    }

    public final String getResponsiblePolicy() {
        return this.A02.mResponsiblePolicy;
    }

    public final String getRestrictionDetailUseCase() {
        return this.A02.mRestrictionDetailUseCase;
    }

    public final String getRestrictionExtraData() {
        return this.A02.mRestrictionExtraData;
    }

    public final String getRestrictionType() {
        return this.A02.mRestrictionType;
    }

    public final boolean getRetryEntireUploadFlow() {
        return this.A02.mRetryEntireUploadFlow.booleanValue();
    }

    public final boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.A02.mSentryBlockRestrictionDialogueUnificationEnabled;
    }

    public final boolean getShouldShowWebviewCancelButton() {
        return !this.A02.mLockCheckpointDialog;
    }

    public final boolean getSpam() {
        return this.A02.mSpam;
    }

    public final int getStatusCode() {
        return this.A02.mStatusCode;
    }

    public final List getSystemMessages() {
        return this.A02.mSystemMessages;
    }

    public final void setFromDiskCache(boolean z) {
        this.A02.mFromDiskCache = z;
    }

    public final void setResponseId(int i) {
        this.A02.mResponseId = i;
    }

    public final void setResponseTimestamp(long j) {
        this.A02.mResponseTimestamp = j;
    }

    public final void setServerElapsedTime(long j) {
        this.A02.mServerElapsedTime = j;
    }

    public final void setStatusCode(int i) {
        this.A02.mStatusCode = i;
    }

    public /* synthetic */ AnonymousClass421(AnonymousClass1R6 r3) {
        this.A02 = r3;
    }

    public final void CiS(long j) {
        this.A00 = j;
    }

    public final void CiU(long j) {
        this.A01 = j;
    }
}
