package com.softserveinc.ita.homeproject.blog.client.api;

import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiResponse;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.softserveinc.ita.homeproject.blog.client.model.Error;
import com.softserveinc.ita.homeproject.blog.client.model.Tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-12T14:02:46.749850500+03:00[Europe/Helsinki]")
public class TagsApi {
  private ApiClient apiClient;

  public TagsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TagsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API cilent
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API cilent
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Tag by ID
   * Retrieves an existing Tag associated with the specified ID.
   * @param id  (required)
   * @return Tag
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public Tag getTag(BigDecimal id) throws ApiException {
    return getTagWithHttpInfo(id).getData();
  }

  /**
   * Get Tag by ID
   * Retrieves an existing Tag associated with the specified ID.
   * @param id  (required)
   * @return ApiResponse&lt;Tag&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Tag> getTagWithHttpInfo(BigDecimal id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTag");
    }
    
    // create path and map variables
    String localVarPath = "/tags/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Tag> localVarReturnType = new GenericType<Tag>() {};

    return apiClient.invokeAPI("TagsApi.getTag", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get tags
   * Uses query keys to retrieve a subset of existing tags.
   * @param id  (optional)
   * @param name  (optional)
   * @param sort In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to name)
   * @param pageNum  (optional)
   * @param pageSize  (optional)
   * @return List&lt;Tag&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Total-Count -  <br>  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public List<Tag> getTags(BigDecimal id, String name, String sort, Integer pageNum, Integer pageSize) throws ApiException {
    return getTagsWithHttpInfo(id, name, sort, pageNum, pageSize).getData();
  }

  /**
   * Get tags
   * Uses query keys to retrieve a subset of existing tags.
   * @param id  (optional)
   * @param name  (optional)
   * @param sort In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to name)
   * @param pageNum  (optional)
   * @param pageSize  (optional)
   * @return ApiResponse&lt;List&lt;Tag&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Total-Count -  <br>  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Tag>> getTagsWithHttpInfo(BigDecimal id, String name, String sort, Integer pageNum, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/tags";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_num", pageNum));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<List<Tag>> localVarReturnType = new GenericType<List<Tag>>() {};

    return apiClient.invokeAPI("TagsApi.getTags", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove Tag
   * Deletes a Tag associated with a specified ID.
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The request was succesfully processed. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public void removeTag(BigDecimal id) throws ApiException {
    removeTagWithHttpInfo(id);
  }

  /**
   * Remove Tag
   * Deletes a Tag associated with a specified ID.
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The request was succesfully processed. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removeTagWithHttpInfo(BigDecimal id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeTag");
    }
    
    // create path and map variables
    String localVarPath = "/tags/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    return apiClient.invokeAPI("TagsApi.removeTag", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
