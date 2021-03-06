package com.arcusys.learn.persistence.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
* The base model interface for the LFSequencing service. Represents a row in the &quot;Learn_LFSequencing&quot; database table, with each column mapped to a property of this class.
*
* <p>
    * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFSequencingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFSequencingImpl}.
    * </p>
*
* @author Brian Wing Shun Chan
* @see LFSequencing
* @see com.arcusys.learn.persistence.liferay.model.impl.LFSequencingImpl
* @see com.arcusys.learn.persistence.liferay.model.impl.LFSequencingModelImpl
* @generated
*/
public interface LFSequencingModel extends BaseModel<LFSequencing> {
    /*
    * NOTE FOR DEVELOPERS:
    *
    * Never modify or reference this interface directly. All methods that expect a l f sequencing model instance should use the {@link LFSequencing} interface instead.
    */

    /**
    * Returns the primary key of this l f sequencing.
    *
    * @return the primary key of this l f sequencing
    */
    public long getPrimaryKey();

    /**
    * Sets the primary key of this l f sequencing.
    *
    * @param primaryKey the primary key of this l f sequencing
    */
    public void setPrimaryKey(long primaryKey);

    /**
    * Returns the ID of this l f sequencing.
    *
    * @return the ID of this l f sequencing
    */
    public long getId();

    /**
        * Sets the ID of this l f sequencing.
    *
    * @param id the ID of this l f sequencing
    */
    public void setId(long id);

    /**
    * Returns the package i d of this l f sequencing.
    *
    * @return the package i d of this l f sequencing
    */
    public Integer getPackageID();

    /**
        * Sets the package i d of this l f sequencing.
    *
    * @param packageID the package i d of this l f sequencing
    */
    public void setPackageID(Integer packageID);

    /**
    * Returns the activity i d of this l f sequencing.
    *
    * @return the activity i d of this l f sequencing
    */
    @AutoEscape
    public String getActivityID();

    /**
        * Sets the activity i d of this l f sequencing.
    *
    * @param activityID the activity i d of this l f sequencing
    */
    public void setActivityID(String activityID);

    /**
    * Returns the shared ID of this l f sequencing.
    *
    * @return the shared ID of this l f sequencing
    */
    @AutoEscape
    public String getSharedId();

    /**
        * Sets the shared ID of this l f sequencing.
    *
    * @param sharedId the shared ID of this l f sequencing
    */
    public void setSharedId(String sharedId);

    /**
    * Returns the shared sequencing ID reference of this l f sequencing.
    *
    * @return the shared sequencing ID reference of this l f sequencing
    */
    @AutoEscape
    public String getSharedSequencingIdReference();

    /**
        * Sets the shared sequencing ID reference of this l f sequencing.
    *
    * @param sharedSequencingIdReference the shared sequencing ID reference of this l f sequencing
    */
    public void setSharedSequencingIdReference(
        String sharedSequencingIdReference);

    /**
    * Returns the only current attempt objective progress for children of this l f sequencing.
    *
    * @return the only current attempt objective progress for children of this l f sequencing
    */
    public boolean getOnlyCurrentAttemptObjectiveProgressForChildren();

    /**
    * Returns <code>true</code> if this l f sequencing is only current attempt objective progress for children.
    *
    * @return <code>true</code> if this l f sequencing is only current attempt objective progress for children; <code>false</code> otherwise
    */
    public boolean isOnlyCurrentAttemptObjectiveProgressForChildren();

    /**
        * Sets whether this l f sequencing is only current attempt objective progress for children.
    *
    * @param onlyCurrentAttemptObjectiveProgressForChildren the only current attempt objective progress for children of this l f sequencing
    */
    public void setOnlyCurrentAttemptObjectiveProgressForChildren(
        boolean onlyCurrentAttemptObjectiveProgressForChildren);

    /**
    * Returns the only current attempt attempt progress for children of this l f sequencing.
    *
    * @return the only current attempt attempt progress for children of this l f sequencing
    */
    public boolean getOnlyCurrentAttemptAttemptProgressForChildren();

    /**
    * Returns <code>true</code> if this l f sequencing is only current attempt attempt progress for children.
    *
    * @return <code>true</code> if this l f sequencing is only current attempt attempt progress for children; <code>false</code> otherwise
    */
    public boolean isOnlyCurrentAttemptAttemptProgressForChildren();

    /**
        * Sets whether this l f sequencing is only current attempt attempt progress for children.
    *
    * @param onlyCurrentAttemptAttemptProgressForChildren the only current attempt attempt progress for children of this l f sequencing
    */
    public void setOnlyCurrentAttemptAttemptProgressForChildren(
        boolean onlyCurrentAttemptAttemptProgressForChildren);

    /**
    * Returns the attempt limit of this l f sequencing.
    *
    * @return the attempt limit of this l f sequencing
    */
    public Integer getAttemptLimit();

    /**
        * Sets the attempt limit of this l f sequencing.
    *
    * @param attemptLimit the attempt limit of this l f sequencing
    */
    public void setAttemptLimit(Integer attemptLimit);

    /**
    * Returns the duration limit in milliseconds of this l f sequencing.
    *
    * @return the duration limit in milliseconds of this l f sequencing
    */
    public Long getDurationLimitInMilliseconds();

    /**
        * Sets the duration limit in milliseconds of this l f sequencing.
    *
    * @param durationLimitInMilliseconds the duration limit in milliseconds of this l f sequencing
    */
    public void setDurationLimitInMilliseconds(Long durationLimitInMilliseconds);

    /**
    * Returns the rollup contribution i d of this l f sequencing.
    *
    * @return the rollup contribution i d of this l f sequencing
    */
    public Integer getRollupContributionID();

    /**
        * Sets the rollup contribution i d of this l f sequencing.
    *
    * @param rollupContributionID the rollup contribution i d of this l f sequencing
    */
    public void setRollupContributionID(Integer rollupContributionID);

    /**
    * Returns the prevent children activation of this l f sequencing.
    *
    * @return the prevent children activation of this l f sequencing
    */
    public boolean getPreventChildrenActivation();

    /**
    * Returns <code>true</code> if this l f sequencing is prevent children activation.
    *
    * @return <code>true</code> if this l f sequencing is prevent children activation; <code>false</code> otherwise
    */
    public boolean isPreventChildrenActivation();

    /**
        * Sets whether this l f sequencing is prevent children activation.
    *
    * @param preventChildrenActivation the prevent children activation of this l f sequencing
    */
    public void setPreventChildrenActivation(boolean preventChildrenActivation);

    /**
    * Returns the constrain choice of this l f sequencing.
    *
    * @return the constrain choice of this l f sequencing
    */
    public boolean getConstrainChoice();

    /**
    * Returns <code>true</code> if this l f sequencing is constrain choice.
    *
    * @return <code>true</code> if this l f sequencing is constrain choice; <code>false</code> otherwise
    */
    public boolean isConstrainChoice();

    /**
        * Sets whether this l f sequencing is constrain choice.
    *
    * @param constrainChoice the constrain choice of this l f sequencing
    */
    public void setConstrainChoice(boolean constrainChoice);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(LFSequencing lfSequencing);

    public int hashCode();

    public CacheModel<LFSequencing> toCacheModel();

    public LFSequencing toEscapedModel();

    public String toString();

    public String toXmlString();
}
