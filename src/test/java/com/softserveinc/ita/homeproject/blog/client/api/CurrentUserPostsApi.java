package com.softserveinc.ita.homeproject.blog.client.api;

import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiResponse;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.softserveinc.ita.homeproject.blog.client.model.Error;
import com.softserveinc.ita.homeproject.blog.client.model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-12T14:02:46.749850500+03:00[Europe/Helsinki]")
public class CurrentUserPostsApi {
  private ApiClient apiClient;

  public CurrentUserPostsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CurrentUserPostsApi(ApiClient apiClient) {
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
   * Get Post by ID and Current User
   * Retrieves an existing Post associated with the specified ID and Current User.
   * @param id  (required)
   * @return Post
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public Post getPostByCurrentUser(BigDecimal id) throws ApiException {
    return getPostByCurrentUserWithHttpInfo(id).getData();
  }

  /**
   * Get Post by ID and Current User
   * Retrieves an existing Post associated with the specified ID and Current User.
   * @param id  (required)
   * @return ApiResponse&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Post> getPostByCurrentUserWithHttpInfo(BigDecimal id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getPostByCurrentUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/current/posts/{id}"
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

    GenericType<Post> localVarReturnType = new GenericType<Post>() {};

    return apiClient.invokeAPI("CurrentUserPostsApi.getPostByCurrentUser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get posts by Current User
   * Uses query keys to retrieve a subset of existing posts assosiated with Current User.
   * @param id  (optional)
   * @param tagId  (optional)
   * @param tagName  (optional)
   * @param sort In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
   * @param pageNum  (optional)
   * @param pageSize  (optional)
   * @return List&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Total-Count -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public List<Post> getPostsByCurrentUser(BigDecimal id, String tagId, String tagName, String sort, Integer pageNum, Integer pageSize) throws ApiException {
    return getPostsByCurrentUserWithHttpInfo(id, tagId, tagName, sort, pageNum, pageSize).getData();
  }

  /**
   * Get posts by Current User
   * Uses query keys to retrieve a subset of existing posts assosiated with Current User.
   * @param id  (optional)
   * @param tagId  (optional)
   * @param tagName  (optional)
   * @param sort In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
   * @param pageNum  (optional)
   * @param pageSize  (optional)
   * @return ApiResponse&lt;List&lt;Post&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Total-Count -  <br>  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Post>> getPostsByCurrentUserWithHttpInfo(BigDecimal id, String tagId, String tagName, String sort, Integer pageNum, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/users/current/posts";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_id", tagId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_name", tagName));
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

    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};

    return apiClient.invokeAPI("CurrentUserPostsApi.getPostsByCurrentUser", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove Post by Current User
   * Deletes a Post associated with a specified ID and Current User.
   * @param id  (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The request was succesfully processed. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public void removePostByCurrentUser(BigDecimal id) throws ApiException {
    removePostByCurrentUserWithHttpInfo(id);
  }

  /**
   * Remove Post by Current User
   * Deletes a Post associated with a specified ID and Current User.
   * @param id  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> The request was succesfully processed. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> removePostByCurrentUserWithHttpInfo(BigDecimal id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removePostByCurrentUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/current/posts/{id}"
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

    return apiClient.invokeAPI("CurrentUserPostsApi.removePostByCurrentUser", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update Post by Current User
   * Updates information on a Post that exists in the system by the specified ID and Current User.
   * @param id  (required)
   * @param post  (required)
   * @return Post
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public Post updatePostByCurrentUser(BigDecimal id, Post post) throws ApiException {
    return updatePostByCurrentUserWithHttpInfo(id, post).getData();
  }

  /**
   * Update Post by Current User
   * Updates information on a Post that exists in the system by the specified ID and Current User.
   * @param id  (required)
   * @param post  (required)
   * @return ApiResponse&lt;Post&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Post> updatePostByCurrentUserWithHttpInfo(BigDecimal id, Post post) throws ApiException {
    Object localVarPostBody = post;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updatePostByCurrentUser");
    }
    
    // verify the required parameter 'post' is set
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling updatePostByCurrentUser");
    }
    
    // create path and map variables
    String localVarPath = "/users/current/posts/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "basicAuth" };

    GenericType<Post> localVarReturnType = new GenericType<Post>() {};

    return apiClient.invokeAPI("CurrentUserPostsApi.updatePostByCurrentUser", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
