// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Model\EntityType.cs.tt

namespace Microsoft.Graph2.CallRecords
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Runtime.Serialization;
    using Newtonsoft.Json;

    /// <summary>
    /// The type Segment.
    /// </summary>
    [JsonObject(MemberSerialization = MemberSerialization.OptIn)]
    public partial class Segment : Microsoft.Graph.Entity
    {
    
		///<summary>
		/// The Segment constructor
		///</summary>
        public Segment()
        {
            this.ODataType = "microsoft.graph2.callRecords.segment";
        }
	
        /// <summary>
        /// Gets or sets start date time.
        /// </summary>
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "startDateTime", Required = Newtonsoft.Json.Required.Default)]
        public DateTimeOffset? StartDateTime { get; set; }
    
        /// <summary>
        /// Gets or sets end date time.
        /// </summary>
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "endDateTime", Required = Newtonsoft.Json.Required.Default)]
        public DateTimeOffset? EndDateTime { get; set; }
    
        /// <summary>
        /// Gets or sets caller.
        /// </summary>
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "caller", Required = Newtonsoft.Json.Required.Default)]
        public Endpoint Caller { get; set; }
    
        /// <summary>
        /// Gets or sets callee.
        /// </summary>
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "callee", Required = Newtonsoft.Json.Required.Default)]
        public Endpoint Callee { get; set; }
    
        /// <summary>
        /// Gets or sets failure info.
        /// </summary>
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "failureInfo", Required = Newtonsoft.Json.Required.Default)]
        public FailureInfo FailureInfo { get; set; }
    
        /// <summary>
        /// Gets or sets media.
        /// </summary>
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "media", Required = Newtonsoft.Json.Required.Default)]
        public IEnumerable<Media> Media { get; set; }
    
        /// <summary>
        /// Gets or sets ref types.
        /// </summary>
        [JsonProperty(NullValueHandling = NullValueHandling.Ignore, PropertyName = "refTypes", Required = Newtonsoft.Json.Required.Default)]
        public ISegmentRefTypesCollectionWithReferencesPage RefTypes { get; set; }
    
    }
}

