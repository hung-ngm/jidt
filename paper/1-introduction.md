# Chapter I. Introduction

This chapter provides important context and motivation for the work. Here's a detailed summary of the key points:

## Linear Dependence Measures

- Widely used across scientific disciplines
  - Examples include:
    - Pearson correlation
    - Canonical correlation analysis
    - Granger causality
- Used to investigate complex relationships in natural and artificial processes

## Concerns about Hypothesis Tests

- Often yield spurious associations (Type I errors) or miss causal relationships (Type II errors)
- Due to autocorrelation present in the analyzed time series
- Autocorrelation is ubiquitous across diverse applications:
  - Brain dynamics
  - Climate change

## Historical Context

- Issue of autocorrelation affecting sampling distributions has a long history in statistics
- Seminal work by Bartlett in the 1930s:
  - Revealed autocorrelation can distort degrees of freedom available to compute statistics
  - Induces an "effective sample size" different from actual dataset length

## Strategies to Handle Autocorrelation

Two main strategies proposed:
1. Prewhitening
   - Remove autoregressive components before computing statistics
   - Known issues:
     - Can reduce size and power properties of hypothesis tests
     - Shown in theory and practice with simulated and recorded data
2. Modify hypothesis tests
   - Adjust tests to account for distorted measurements
   - Relatively underused:
     - More often found in applications with short time series and high autocorrelation
     - Recently demonstrated successfully for correlation analysis in fMRI signals

## Current State of Theory

- Well-developed for bivariate relationships
- Incomplete for:
  - Multiple time series
  - Directed relationships

## Granger Causality

- Measure for directed dependencies
- Extremely popular:
  - Introduced nearly 60 years ago for economics
  - Now used across many fields:
    - Brain dynamics
    - Climate change
    - Political relationships
- Recent research shows certain preprocessing techniques (e.g., filtering) can increase false positive rates

## Paper Aims

- Illustrate why standard tests produce errors
- Provide corrected tests for a broad class of linear dependence measures
- Unify earlier work on correlation coefficients with more complex measures like Granger causality

## Authors' Approach

- Leverages concept of effective sample size
- Derives hypothesis tests for correlation-based measures of linear dependence between covariance-stationary time series
- Includes measures such as:
  - Granger causality
  - Mutual information with Gaussian marginals

## Significance of Contributions

- Many reported dependencies in scientific literature may be spurious
- Proposed methods allow for correct inference of linear relationships within complex systems across various scientific applications

This introduction sets the stage for the paper by highlighting the widespread problem of autocorrelation in time series analysis, the limitations of current approaches, and the broad applicability of the authors' proposed solution across multiple scientific domains.
