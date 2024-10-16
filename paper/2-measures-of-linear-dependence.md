# Chapter II. Measures of Linear Dependence

## Introduction to Multivariate Time Series

- Defines a collection of m series sampled at equally spaced time intervals
- Introduces notation for m-dimensional vector of multiple time series Z(t)

## Partitioning for Linear Dependence Analysis

- Z is partitioned into k-variate subprocess X and l-variate subprocess Y
- Linear dependence is measured by how much Y reduces uncertainty over X

## Assumptions about the Underlying System

- Z is assumed to be a second-order stationary, purely nondeterministic process
- Can be represented by an ARMA model after mean removal and differencing
- Assumes Gaussian noise, making Z a linear-Gaussian process

## Cross-correlation and Autocorrelation

- Defines cross-correlation ρij(u) between Zi(t) and Zj(t+u)
- Introduces autocorrelation function for univariate processes
- Presents sample cross-correlation coefficients

## Pearson's Correlation Coefficient

- Defined as the lag-zero cross-correlation ρXY(0)
- Introduces Bartlett's formula for estimating variance of sample correlation coefficient
- Discusses the concept of effective degree of freedom

## Partial Correlation

- Measures association between X and Y while controlling for a concomitant process W
- Introduces the formula for sample partial correlation

## Wilks' Criterion and Canonical Correlations

- Extends partial correlation to relate two or more sets of variables
- Introduces Wilks' criterion as a ratio of generalized sample variances
- Mentions Hotelling's work on canonical correlations

## Mutual Information

- Fundamental concept in information theory
- For normally distributed variables, equivalent to Wilks' criterion
- Introduces formula for mutual information estimate
- Discusses asymptotic chi-square distribution and more precise F-test for limited data

## Granger Causality

- Designed to capture one-way dependence between stochastic processes
- Assumes X and Y are vector autoregressive processes
- Quantified by conditional mutual information
- Introduces formula for Granger causality estimate
- Discusses methods for determining AR orders (p and q)
- Presents asymptotic chi-square distribution and finite-sample F-distribution for hypothesis testing

## Limitations of Current Hypothesis Tests

- Standard tests (F-test and χ²-test) assume either completely independent residuals or infinite data
- The paper aims to overcome these limitations by providing valid finite-sample tests for Granger causality
