package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1j3  reason: invalid class name */
public class AnonymousClass1j3 extends C685344e implements C85814vo {
    public String mCategory;
    public C62123Xf mCheckpoint;
    public String mCheckpointUrl;
    public String mClientFacingErrorMessage;
    public C571339w mConsentData;
    public String mDialogueType;
    public String mEnrollmentTime;
    public String mErrorBody;
    public String mErrorCode;
    public String mErrorMessage;
    public String mErrorSource;
    public List mErrorStrings;
    public String mErrorTitle;
    public String mErrorType;
    public String mExpirationTime;
    public String mFeedbackAction;
    public String mFeedbackAppealLabel;
    public String mFeedbackIgnoreLabel;
    public String mFeedbackMessage;
    public boolean mFeedbackRequired;
    public String mFeedbackTitle;
    public String mFeedbackUrl;
    public boolean mIsEpdError;
    public String mLocalizedErrorMessage;
    public boolean mLockCheckpointDialog;
    public String mLogoutReason;
    public Boolean mNewsURLIsRegulated;
    public String mReasonsThrown;
    public String mResponsiblePolicy;
    public String mRestrictionDetailUseCase;
    public String mRestrictionExtraData;
    public String mRestrictionType;
    public Integer mRetryCooldownTimeInSec;
    public Boolean mRetryEntireUploadFlow;
    public boolean mSentryBlockRestrictionDialogueUnificationEnabled;
    public boolean mSpam;
    public String mStatus;
    public List mSystemMessages;

    public static DirectMessagesInteropOptionsViewModel A01(AnonymousClass1U6 r10) {
        return new DirectMessagesInteropOptionsViewModel(C60203Oc.A01(r10.A06), C60203Oc.A01(r10.A01), C60203Oc.A01(r10.A02), C60203Oc.A01(r10.A0A), C60203Oc.A01(r10.A09), C60203Oc.A01(r10.A08), C60203Oc.A01(r10.A04), C60203Oc.A01(r10.A03), C60203Oc.A01(r10.A05), C60203Oc.A01(r10.A07));
    }

    public static String A02(Object obj) {
        String str = ((AnonymousClass18L) obj).A01.A0D;
        C04220Ms.A06(str);
        return str;
    }

    public String getCategory() {
        return this.mCategory;
    }

    public C62123Xf getCheckpoint() {
        return this.mCheckpoint;
    }

    public String getCheckpointUrl() {
        return this.mCheckpointUrl;
    }

    public String getClientFacingErrorMessage() {
        return this.mClientFacingErrorMessage;
    }

    public C571339w getConsentData() {
        return this.mConsentData;
    }

    public String getDialogueType() {
        return this.mDialogueType;
    }

    public String getEnrollmentTime() {
        return this.mEnrollmentTime;
    }

    public String getErrorBody() {
        return this.mErrorBody;
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public String getErrorSource() {
        return this.mErrorSource;
    }

    public List getErrorStrings() {
        return this.mErrorStrings;
    }

    public String getErrorTitle() {
        return this.mErrorTitle;
    }

    public String getErrorType() {
        return this.mErrorType;
    }

    public String getExpirationTime() {
        return this.mExpirationTime;
    }

    public String getFeedbackAction() {
        return this.mFeedbackAction;
    }

    public String getFeedbackAppealLabel() {
        return this.mFeedbackAppealLabel;
    }

    public String getFeedbackIgnoreLabel() {
        return this.mFeedbackIgnoreLabel;
    }

    public String getFeedbackMessage() {
        return this.mFeedbackMessage;
    }

    public String getFeedbackTitle() {
        return this.mFeedbackTitle;
    }

    public String getFeedbackUrl() {
        return this.mFeedbackUrl;
    }

    public String getLocalizedErrorMessage() {
        return this.mLocalizedErrorMessage;
    }

    public String getLogoutReason() {
        return this.mLogoutReason;
    }

    public boolean getNewsURLIsRegulated() {
        return this.mNewsURLIsRegulated.booleanValue();
    }

    public String getReasonsThrown() {
        return this.mReasonsThrown;
    }

    public String getResponsiblePolicy() {
        return this.mResponsiblePolicy;
    }

    public String getRestrictionDetailUseCase() {
        return this.mRestrictionDetailUseCase;
    }

    public String getRestrictionExtraData() {
        return this.mRestrictionExtraData;
    }

    public String getRestrictionType() {
        return this.mRestrictionType;
    }

    public int getRetryCooldownTimeInMs() {
        Integer num = this.mRetryCooldownTimeInSec;
        if (num == null) {
            return 0;
        }
        return num.intValue() * 1000;
    }

    public boolean getRetryEntireUploadFlow() {
        return this.mRetryEntireUploadFlow.booleanValue();
    }

    public boolean getSentryBlockRestrictionDialogueUnificationEnabled() {
        return this.mSentryBlockRestrictionDialogueUnificationEnabled;
    }

    public boolean getShouldShowWebviewCancelButton() {
        return !this.mLockCheckpointDialog;
    }

    public boolean getSpam() {
        return this.mSpam;
    }

    public String getStatus() {
        String str = this.mStatus;
        if (str == null) {
            return "";
        }
        return str;
    }

    public List getSystemMessages() {
        return this.mSystemMessages;
    }

    public boolean hasErrorType(String str) {
        String str2 = this.mErrorType;
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        return true;
    }

    public boolean isCheckpointRequired() {
        String str = this.mErrorMessage;
        if ("checkpoint_required".equals(str) || "challenge_required".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean isConsentRequired() {
        return "consent_required".equals(this.mErrorMessage);
    }

    public boolean isEpdError() {
        return this.mIsEpdError;
    }

    public boolean isFeedbackRequired() {
        if (this.mFeedbackRequired || "feedback_required".equals(this.mErrorMessage)) {
            return true;
        }
        return false;
    }

    public boolean isLoginRequired() {
        return "login_required".equals(this.mErrorMessage);
    }

    public boolean isNoContent() {
        return AnonymousClass0wJ.A1T(this.mStatusCode, HttpStatus.SC_NO_CONTENT);
    }

    public boolean isViolatingBrandedContentPolicy() {
        return "branded_content_policy_violated".equals(this.mErrorMessage);
    }

    public boolean isOk() {
        return "ok".equals(getStatus());
    }

    public void parseError(MMo mMo) {
        C40318LcR A0f = mMo.A0f();
        if (A0f == C40318LcR.START_OBJECT) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            while (mMo.A0g() != C40318LcR.END_OBJECT) {
                String A0o = mMo.A0o();
                if (A0o == null || !A0o.equals("errors")) {
                    mMo.A0x();
                } else {
                    mMo.A0g();
                    if (mMo.A0f() == C40318LcR.START_ARRAY) {
                        while (mMo.A0g() != C40318LcR.END_ARRAY) {
                            A0v.add(mMo.A0p());
                        }
                    }
                }
            }
            this.mErrorStrings = A0v;
        } else if (A0f == C40318LcR.START_ARRAY) {
            mMo.A0x();
        } else {
            this.mErrorMessage = mMo.A0p();
        }
    }

    public void setStatus(String str) {
        this.mStatus = str;
    }

    public boolean hasErrorType() {
        return AnonymousClass0wJ.A1W(this.mErrorType);
    }
}
