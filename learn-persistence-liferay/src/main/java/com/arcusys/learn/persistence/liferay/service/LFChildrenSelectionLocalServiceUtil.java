package com.arcusys.learn.persistence.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the l f children selection local service. This utility wraps {@link com.arcusys.learn.persistence.liferay.service.impl.LFChildrenSelectionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFChildrenSelectionLocalService
 * @see com.arcusys.learn.persistence.liferay.service.base.LFChildrenSelectionLocalServiceBaseImpl
 * @see com.arcusys.learn.persistence.liferay.service.impl.LFChildrenSelectionLocalServiceImpl
 * @generated
 */
public class LFChildrenSelectionLocalServiceUtil {
    private static LFChildrenSelectionLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.arcusys.learn.persistence.liferay.service.impl.LFChildrenSelectionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the l f children selection to the database. Also notifies the appropriate model listeners.
    *
    * @param lfChildrenSelection the l f children selection
    * @return the l f children selection that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection addLFChildrenSelection(
        com.arcusys.learn.persistence.liferay.model.LFChildrenSelection lfChildrenSelection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addLFChildrenSelection(lfChildrenSelection);
    }

    /**
    * Creates a new l f children selection with the primary key. Does not add the l f children selection to the database.
    *
    * @param id the primary key for the new l f children selection
    * @return the new l f children selection
    */
    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection createLFChildrenSelection(
        long id) {
        return getService().createLFChildrenSelection(id);
    }

    /**
    * Deletes the l f children selection with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f children selection
    * @return the l f children selection that was removed
    * @throws PortalException if a l f children selection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection deleteLFChildrenSelection(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFChildrenSelection(id);
    }

    /**
    * Deletes the l f children selection from the database. Also notifies the appropriate model listeners.
    *
    * @param lfChildrenSelection the l f children selection
    * @return the l f children selection that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection deleteLFChildrenSelection(
        com.arcusys.learn.persistence.liferay.model.LFChildrenSelection lfChildrenSelection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteLFChildrenSelection(lfChildrenSelection);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection fetchLFChildrenSelection(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchLFChildrenSelection(id);
    }

    /**
    * Returns the l f children selection with the primary key.
    *
    * @param id the primary key of the l f children selection
    * @return the l f children selection
    * @throws PortalException if a l f children selection with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection getLFChildrenSelection(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFChildrenSelection(id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the l f children selections.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of l f children selections
    * @param end the upper bound of the range of l f children selections (not inclusive)
    * @return the range of l f children selections
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFChildrenSelection> getLFChildrenSelections(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFChildrenSelections(start, end);
    }

    /**
    * Returns the number of l f children selections.
    *
    * @return the number of l f children selections
    * @throws SystemException if a system exception occurred
    */
    public static int getLFChildrenSelectionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getLFChildrenSelectionsCount();
    }

    /**
    * Updates the l f children selection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfChildrenSelection the l f children selection
    * @return the l f children selection that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection updateLFChildrenSelection(
        com.arcusys.learn.persistence.liferay.model.LFChildrenSelection lfChildrenSelection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLFChildrenSelection(lfChildrenSelection);
    }

    /**
    * Updates the l f children selection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lfChildrenSelection the l f children selection
    * @param merge whether to merge the l f children selection with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the l f children selection that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection updateLFChildrenSelection(
        com.arcusys.learn.persistence.liferay.model.LFChildrenSelection lfChildrenSelection,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateLFChildrenSelection(lfChildrenSelection, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection createLFChildrenSelection()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().createLFChildrenSelection();
    }

    public static com.arcusys.learn.persistence.liferay.model.LFChildrenSelection findBySequencingID(
        java.lang.Integer sequencingID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFChildrenSelectionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().findBySequencingID(sequencingID);
    }

    public static void removeBySequencingID(java.lang.Integer sequencingID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFChildrenSelectionException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().removeBySequencingID(sequencingID);
    }

    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeAll();
    }

    public static void clearService() {
        _service = null;
    }

    public static LFChildrenSelectionLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    LFChildrenSelectionLocalService.class.getName());

            if (invokableLocalService instanceof LFChildrenSelectionLocalService) {
                _service = (LFChildrenSelectionLocalService) invokableLocalService;
            } else {
                _service = new LFChildrenSelectionLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(LFChildrenSelectionLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(LFChildrenSelectionLocalService service) {
    }
}
