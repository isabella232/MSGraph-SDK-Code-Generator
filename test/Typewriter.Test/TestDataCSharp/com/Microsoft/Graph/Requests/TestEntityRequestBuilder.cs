// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\EntityRequestBuilder.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;
    using System.IO;

    /// <summary>
    /// The type TestEntityRequestBuilder.
    /// </summary>
    public partial class TestEntityRequestBuilder : EntityRequestBuilder, ITestEntityRequestBuilder
    {

        /// <summary>
        /// Constructs a new TestEntityRequestBuilder.
        /// </summary>
        /// <param name="requestUrl">The URL for the built request.</param>
        /// <param name="client">The <see cref="IBaseClient"/> for handling requests.</param>
        public TestEntityRequestBuilder(
            string requestUrl,
            IBaseClient client)
            : base(requestUrl, client)
        {
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <returns>The built request.</returns>
        public new ITestEntityRequest Request()
        {
            return this.Request(null);
        }

        /// <summary>
        /// Builds the request.
        /// </summary>
        /// <param name="options">The query and header options for the request.</param>
        /// <returns>The built request.</returns>
        public new ITestEntityRequest Request(IEnumerable<Option> options)
        {
            return new TestEntityRequest(this.RequestUrl, this.Client, options);
        }
    
        /// <summary>
        /// Gets the request builder for TestNav.
        /// </summary>
        /// <returns>The <see cref="ITestTypeWithReferenceRequestBuilder"/>.</returns>
        public ITestTypeWithReferenceRequestBuilder TestNav
        {
            get
            {
                return new TestTypeWithReferenceRequestBuilder(this.AppendSegmentToRequestUrl("testNav"), this.Client);
            }
        }

        /// <summary>
        /// Gets the request builder for TestInvalidNav.
        /// </summary>
        /// <returns>The <see cref="IEntityType2WithReferenceRequestBuilder"/>.</returns>
        public IEntityType2WithReferenceRequestBuilder TestInvalidNav
        {
            get
            {
                return new EntityType2WithReferenceRequestBuilder(this.AppendSegmentToRequestUrl("testInvalidNav"), this.Client);
            }
        }

        /// <summary>
        /// Gets the request builder for TestExplicitNav.
        /// </summary>
        /// <returns>The <see cref="IEntityType3WithReferenceRequestBuilder"/>.</returns>
        public IEntityType3WithReferenceRequestBuilder TestExplicitNav
        {
            get
            {
                return new EntityType3WithReferenceRequestBuilder(this.AppendSegmentToRequestUrl("testExplicitNav"), this.Client);
            }
        }
    
    }
}
