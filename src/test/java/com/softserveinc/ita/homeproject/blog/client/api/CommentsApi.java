package com.softserveinc.ita.homeproject.blog.client.api;

import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiResponse;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.softserveinc.ita.homeproject.blog.client.model.Comment;
import com.softserveinc.ita.homeproject.blog.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-12T14:02:46.749850500+03:00[Europe/Helsinki]")
public class CommentsApi {
  private ApiClient apiClient;

  public CommentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommentsApi(ApiClient apiClient) {
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
   * Create Comment
   * Create a new Comment.
   * @param postId  (required)
   * @param comment  (required)
   * @return Comment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public Comment createComment(BigDecimal postId, Comment comment) throws ApiException {
    return createCommentWithHttpInfo(postId, comment).getData();
  }

  /**
   * Create Comment
   * Create a new Comment.
   * @param postId  (required)
   * @param comment  (required)
   * @return ApiResponse&lt;Comment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Comment> createCommentWithHttpInfo(BigDecimal postId, Comment comment) throws ApiException {
    Object localVarPostBody = comment;
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling createComment");
    }
    
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling createComment");
    }
    
    // create path and map variables
    String localVarPath = "/posts/{post_id}/comments"
      .replaceAll("\\{" + "post_id" + "\\}", apiClient.escapeString(postId.toString()));

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

    GenericType<Comment> localVarReturnType = new GenericType<Comment>() {};

    return apiClient.invokeAPI("CommentsApi.createComment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get Comment by ID.
   * Retrieves an existing Comment associated with the specified ID.
   * @param postId  (required)
   * @param id  (required)
   * @return Comment
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
  public Comment getComment(BigDecimal postId, BigDecimal id) throws ApiException {
    return getCommentWithHttpInfo(postId, id).getData();
  }

  /**
   * Get Comment by ID.
   * Retrieves an existing Comment associated with the specified ID.
   * @param postId  (required)
   * @param id  (required)
   * @return ApiResponse&lt;Comment&gt;
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
  public ApiResponse<Comment> getCommentWithHttpInfo(BigDecimal postId, BigDecimal id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling getComment");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getComment");
    }
    
    // create path and map variables
    String localVarPath = "/posts/{post_id}/comments/{id}"
      .replaceAll("\\{" + "post_id" + "\\}", apiClient.escapeString(postId.toString()))
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

    GenericType<Comment> localVarReturnType = new GenericType<Comment>() {};

    return apiClient.invokeAPI("CommentsApi.getComment", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get comments
   * Uses query keys to retrieve a subset of existing comments.
   * @param postId  (required)
   * @param id  (optional)
   * @param authorName  (optional)
   * @param sort In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
   * @param pageNum  (optional)
   * @param pageSize  (optional)
   * @return List&lt;Comment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Total-Count -  <br>  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public List<Comment> getComments(BigDecimal postId, BigDecimal id, String authorName, String sort, Integer pageNum, Integer pageSize) throws ApiException {
    return getCommentsWithHttpInfo(postId, id, authorName, sort, pageNum, pageSize).getData();
  }

  /**
   * Get comments
   * Uses query keys to retrieve a subset of existing comments.
   * @param postId  (required)
   * @param id  (optional)
   * @param authorName  (optional)
   * @param sort In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
   * @param pageNum  (optional)
   * @param pageSize  (optional)
   * @return ApiResponse&lt;List&lt;Comment&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  * X-Total-Count -  <br>  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Comment>> getCommentsWithHttpInfo(BigDecimal postId, BigDecimal id, String authorName, String sort, Integer pageNum, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling getComments");
    }
    
    // create path and map variables
    String localVarPath = "/posts/{post_id}/comments"
      .replaceAll("\\{" + "post_id" + "\\}", apiClient.escapeString(postId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author_name", authorName));
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

    GenericType<List<Comment>> localVarReturnType = new GenericType<List<Comment>>() {};

    return apiClient.invokeAPI("CommentsApi.getComments", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Remove Comment
   * Deletes a Comment associated with a specified ID.
   * @param postId  (required)
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
  public void removeComment(BigDecimal postId, BigDecimal id) throws ApiException {
    removeCommentWithHttpInfo(postId, id);
  }

  /**
   * Remove Comment
   * Deletes a Comment associated with a specified ID.
   * @param postId  (required)
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
  public ApiResponse<Void> removeCommentWithHttpInfo(BigDecimal postId, BigDecimal id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling removeComment");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling removeComment");
    }
    
    // create path and map variables
    String localVarPath = "/posts/{post_id}/comments/{id}"
      .replaceAll("\\{" + "post_id" + "\\}", apiClient.escapeString(postId.toString()))
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

    return apiClient.invokeAPI("CommentsApi.removeComment", localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Update Comment
   * Updates information on a Comment that exists in the system by the specified ID and post ID.
   * @param postId  (required)
   * @param id  (required)
   * @param comment  (required)
   * @return Comment
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public Comment updateComment(BigDecimal postId, BigDecimal id, Comment comment) throws ApiException {
    return updateCommentWithHttpInfo(postId, id, comment).getData();
  }

  /**
   * Update Comment
   * Updates information on a Comment that exists in the system by the specified ID and post ID.
   * @param postId  (required)
   * @param id  (required)
   * @param comment  (required)
   * @return ApiResponse&lt;Comment&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> The payload contains an error. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden. </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> The specified resource was not found. </td><td>  -  </td></tr>
       <tr><td> 0 </td><td> The unknown error appeard. Check your payload or contact support. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Comment> updateCommentWithHttpInfo(BigDecimal postId, BigDecimal id, Comment comment) throws ApiException {
    Object localVarPostBody = comment;
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling updateComment");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateComment");
    }
    
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling updateComment");
    }
    
    // create path and map variables
    String localVarPath = "/posts/{post_id}/comments/{id}"
      .replaceAll("\\{" + "post_id" + "\\}", apiClient.escapeString(postId.toString()))
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

    GenericType<Comment> localVarReturnType = new GenericType<Comment>() {};

    return apiClient.invokeAPI("CommentsApi.updateComment", localVarPath, "PUT", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
